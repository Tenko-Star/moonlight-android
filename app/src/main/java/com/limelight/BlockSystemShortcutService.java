package com.limelight;

import android.accessibilityservice.AccessibilityService;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.util.Log;

public class BlockSystemShortcutService extends AccessibilityService {
    private static final String TAG = "BlockSystemShortcut";

    @Override
    protected boolean onKeyEvent(KeyEvent event) {
        final var keyCode = event.getKeyCode();
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.d(TAG, "返回键 已被屏蔽！");
            return true;
        }

        return super.onKeyEvent(event);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {

    }

    @Override
    public void onInterrupt() {
        Log.d(TAG, "onInterrupt");
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        Log.d(TAG, "onServiceConnected");
    }
}
