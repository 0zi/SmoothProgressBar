package fr.castorflex.android.circularprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

interface PBDelegate {
  void draw(Canvas canvas, Paint paint);

  void start();

  void stop();

  void resume();

  void pause();

  void progressiveStop(CircularProgressDrawable.OnEndListener listener);
}
