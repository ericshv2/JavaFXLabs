#!/bin/bash

# Kill any existing sessions
pkill Xvfb
pkill x11vnc
pkill fluxbox
pkill websockify

# Start virtual display
Xvfb :99 -screen 0 1280x720x24 &
export DISPLAY=:99

# Start window manager
fluxbox &

# Start VNC server
x11vnc -display :99 -forever -shared -rfbport 5900 &

# Start noVNC (web-based VNC client)
websockify --web=/usr/share/novnc 6080 localhost:5900 &

echo "VNC server started!"
echo "Access it by forwarding port 6080 and opening in browser"
