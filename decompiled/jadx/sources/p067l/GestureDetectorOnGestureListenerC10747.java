package p067l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC10747 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ֫֫ */
    public long f29788;

    /* JADX INFO: renamed from: ۗ */
    public AnimatorSet f29789;

    /* JADX INFO: renamed from: ۙ */
    public float f29790;

    /* JADX INFO: renamed from: ۛ */
    public long f29791;

    /* JADX INFO: renamed from: ۟ */
    public float f29792;

    /* JADX INFO: renamed from: ۤ */
    public final Formatter f29793;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f29794;

    /* JADX INFO: renamed from: ۨ */
    public int f29795;

    /* JADX INFO: renamed from: ۫ */
    public final StringBuilder f29796;

    /* JADX INFO: renamed from: ۬ */
    public boolean f29797;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ ActivityC12088 f29799;

    /* JADX INFO: renamed from: ᩶ */
    public long f29801;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f29802;

    /* JADX INFO: renamed from: ᩹ */
    public final AudioManager f29803;

    /* JADX INFO: renamed from: ᩺ */
    public float f29804;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final int f29800 = C13076.m29939(150.0f);

    /* JADX INFO: renamed from: ܰ */
    public int f29798 = -1;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnGestureListenerC10747(ActivityC12088 activityC12088) {
        this.f29799 = activityC12088;
        this.f29803 = (AudioManager) activityC12088.getSystemService("audio");
        StringBuilder sb = new StringBuilder();
        this.f29796 = sb;
        this.f29793 = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ActivityC12088 activityC12088 = this.f29799;
        if (activityC12088.f33788.m45496()) {
            activityC12088.f33788.m45497();
            return true;
        }
        activityC12088.f33788.m45498();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ActivityC12088 activityC12088 = this.f29799;
        if (ActivityC12088.m27752(activityC12088)) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        activityC12088.m27867();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f29798 = -1;
        ActivityC12088 activityC12088 = this.f29799;
        this.f29802 = (activityC12088.f33687 || ActivityC12088.m27752(activityC12088)) ? false : true;
        ActivityC12088.m27778(activityC12088);
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24755() {
        if (this.f29797) {
            this.f29797 = false;
            ActivityC12088 activityC12088 = this.f29799;
            activityC12088.f33780.setVisibility(8);
            activityC12088.f33747.mo6800(new C4963(this.f29804));
            AnimatorSet animatorSet = this.f29789;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29789 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24754(long j) {
        ActivityC12088 activityC12088 = this.f29799;
        if (activityC12088.f33686 == null || activityC12088.f33770 == null) {
            return;
        }
        StringBuilder sb = this.f29796;
        Formatter formatter = this.f29793;
        String strM12996 = C5792.m12996(sb, formatter, j);
        String strM12997 = C5792.m12996(sb, formatter, this.f29791);
        String strM12998 = C5792.m12996(sb, formatter, j - this.f29788);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strM12996).append('/').append((CharSequence) strM12997).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append('[');
        if (strM12998.equals("-00:00") || strM12998.equals("00:00")) {
            spannableStringBuilderAppend.append((CharSequence) "00:00");
        } else {
            if (strM12998.charAt(0) != '-') {
                spannableStringBuilderAppend.append('+');
            }
            spannableStringBuilderAppend.append((CharSequence) strM12998);
        }
        spannableStringBuilderAppend.append(']');
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), 0, strM12996.length(), 17);
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), length, spannableStringBuilderAppend.length(), 17);
        activityC12088.f33686.setText(spannableStringBuilderAppend);
        ProgressBar progressBar = activityC12088.f33770;
        long j2 = this.f29791;
        progressBar.setProgress(j2 > 0 ? (int) ((j * 1000) / j2) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01fb A[PHI: r3
      0x01fb: PHI (r3v11 long) = (r3v9 long), (r3v10 long) binds: [B:80:0x01f9, B:83:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f29802) {
            ActivityC12088 activityC12088 = this.f29799;
            if (!activityC12088.f33687) {
                int i = this.f29798;
                AudioManager audioManager = this.f29803;
                if (i == -1) {
                    if (motionEvent != null && (motionEvent.getY() > activityC12088.f33788.getHeight() * 0.9f || motionEvent.getY() < activityC12088.f33788.getHeight() * 0.1f)) {
                        this.f29798 = -2;
                    } else if (Math.abs(f) > Math.abs(f2)) {
                        if (activityC12088.f33706) {
                            this.f29798 = -2;
                            return false;
                        }
                        long duration = activityC12088.f33747.getDuration();
                        this.f29791 = duration;
                        if (duration == -9223372036854775807L) {
                            this.f29798 = -2;
                        } else {
                            activityC12088.f33702.setVisibility(8);
                            this.f29798 = 0;
                            long currentPosition = activityC12088.f33747.getCurrentPosition();
                            this.f29801 = currentPosition;
                            this.f29788 = currentPosition;
                            ActivityC12088.m27810(activityC12088);
                            m24754(this.f29801);
                            if (ActivityC12088.m27709(activityC12088, this.f29801, true, true) == null) {
                                activityC12088.m27852();
                            }
                        }
                    } else {
                        ActivityC12088.m27778(activityC12088);
                        activityC12088.f33702.setVisibility(0);
                        activityC12088.f33726.setVisibility(8);
                        activityC12088.f33696.setVisibility(0);
                        this.f29790 = motionEvent2.getY();
                        if (motionEvent2.getX() < activityC12088.f33788.getWidth() / 2.0f) {
                            this.f29798 = 1;
                            float f3 = activityC12088.getWindow().getAttributes().screenBrightness;
                            if (f3 == -1.0f) {
                                f3 = Settings.System.getInt(activityC12088.getContentResolver(), "screen_brightness", C0254q.f1218h) / 255.0f;
                            }
                            this.f29792 = f3;
                        } else {
                            this.f29798 = 2;
                            if (audioManager != null) {
                                this.f29794 = audioManager.getStreamVolume(3);
                                this.f29795 = audioManager.getStreamMaxVolume(3);
                            }
                        }
                    }
                }
                int i2 = this.f29798;
                if (i2 != 0) {
                    int i3 = this.f29800;
                    if (i2 == 1) {
                        float y = this.f29792 - ((motionEvent2.getY() - this.f29790) / i3);
                        if (y < 0.0f) {
                            y = 0.0f;
                        } else if (y > 1.0f) {
                            y = 1.0f;
                        }
                        WindowManager.LayoutParams attributes = activityC12088.getWindow().getAttributes();
                        if (attributes.screenBrightness != y) {
                            attributes.screenBrightness = y;
                            activityC12088.getWindow().setAttributes(attributes);
                        }
                        int i4 = (int) (y * 1000.0f);
                        if (i4 == 0) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 333) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 666) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        }
                        activityC12088.f33735.setProgress(i4);
                        return true;
                    }
                    if (i2 == 2) {
                        float y2 = motionEvent2.getY() - this.f29790;
                        int i5 = this.f29795;
                        int i6 = (int) (this.f29794 - ((y2 / i3) * i5));
                        if (i6 < 0) {
                            i6 = 0;
                        } else if (i6 > i5) {
                            i6 = i5;
                        }
                        int i7 = (i6 * 1000) / i5;
                        if (i7 == 0) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 333) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 666) {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC12088.f33696.setImageResource(R.drawable.MT_Protector);
                        }
                        if (audioManager != null) {
                            audioManager.setStreamVolume(3, i6, 0);
                        }
                        activityC12088.f33735.setProgress(i7);
                        return true;
                    }
                } else {
                    long jM29939 = this.f29801 - ((long) ((f / C13076.m29939(3.0f)) * 1000.0f));
                    long j = 0;
                    if (jM29939 < 0) {
                        jM29939 = j;
                    } else {
                        j = this.f29791;
                        if (jM29939 > j) {
                            jM29939 = j;
                        }
                    }
                    this.f29801 = jM29939;
                    m24754(jM29939);
                    if (ActivityC12088.m27709(activityC12088, jM29939, true, false) == null) {
                        activityC12088.m27852();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ActivityC12088 activityC12088 = this.f29799;
        if (ActivityC12088.m27752(activityC12088) || activityC12088.f33706) {
            return;
        }
        if (activityC12088.f33747.isPlaying() || (activityC12088.f33747.mo6835() == 3 && activityC12088.f33747.mo6839())) {
            activityC12088.f33788.m45497();
            this.f29797 = true;
            activityC12088.f33780.setVisibility(0);
            float f = activityC12088.f33747.mo6831().f11305;
            this.f29804 = f;
            float fMax = Math.max(2.0f, f * 2.0f);
            ((TextView) activityC12088.f33780.getChildAt(3)).setText(new DecimalFormat("0.0##X").format(fMax));
            activityC12088.f33747.mo6800(new C4963(fMax));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m24753(0), m24753(1), m24753(2));
            animatorSet.setDuration(800L);
            animatorSet.start();
            this.f29789 = animatorSet;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private ObjectAnimator m24753(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29799.f33780.getChildAt(i), "alpha", 1.0f, 0.5f, 0.2f, 0.2f, 0.5f, 1.0f);
        final float f = 0.9f - (i * 0.1f);
        objectAnimatorOfFloat.setInterpolator(new TimeInterpolator() { // from class: l.ۢۤۜ
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                float f3 = f2 + f;
                return f3 > 1.0f ? f3 - 1.0f : f3;
            }
        });
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        return objectAnimatorOfFloat;
    }
}
