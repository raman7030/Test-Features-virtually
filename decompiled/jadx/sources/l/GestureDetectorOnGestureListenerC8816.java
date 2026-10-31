package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.y.q;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC8816 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f26863;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f26864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f26865;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f26866;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f26867;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Formatter f26868;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f26869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26870;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26871;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f26872;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f26874;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f26876;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AudioManager f26878;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f26879;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f26875 = C11266.m27878(150.0f);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26873 = -1;

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

    public GestureDetectorOnGestureListenerC8816(ActivityC10227 activityC10227) {
        this.f26874 = activityC10227;
        this.f26878 = (AudioManager) activityC10227.getSystemService("audio");
        StringBuilder sb = new StringBuilder();
        this.f26871 = sb;
        this.f26868 = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ActivityC10227 activityC10227 = this.f26874;
        if (activityC10227.f30827.m43230()) {
            activityC10227.f30827.m43231();
            return true;
        }
        activityC10227.f30827.m43232();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ActivityC10227 activityC10227 = this.f26874;
        if (ActivityC10227.m25730(activityC10227)) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        activityC10227.m25845();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f26873 = -1;
        ActivityC10227 activityC10227 = this.f26874;
        this.f26877 = (activityC10227.f30726 || ActivityC10227.m25730(activityC10227)) ? false : true;
        ActivityC10227.m25756(activityC10227);
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22785() {
        if (this.f26872) {
            this.f26872 = false;
            ActivityC10227 activityC10227 = this.f26874;
            activityC10227.f30819.setVisibility(8);
            activityC10227.f30786.mo4568(new C2730(this.f26879));
            AnimatorSet animatorSet = this.f26864;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26864 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22784(long j) {
        ActivityC10227 activityC10227 = this.f26874;
        if (activityC10227.f30725 == null || activityC10227.f30809 == null) {
            return;
        }
        StringBuilder sb = this.f26871;
        Formatter formatter = this.f26868;
        String strM11020 = C3603.m11020(sb, formatter, j);
        String strM11021 = C3603.m11020(sb, formatter, this.f26866);
        String strM11022 = C3603.m11020(sb, formatter, j - this.f26863);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) strM11020).append('/').append((CharSequence) strM11021).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append('[');
        if (strM11022.equals("-00:00") || strM11022.equals("00:00")) {
            spannableStringBuilderAppend.append((CharSequence) "00:00");
        } else {
            if (strM11022.charAt(0) != '-') {
                spannableStringBuilderAppend.append('+');
            }
            spannableStringBuilderAppend.append((CharSequence) strM11022);
        }
        spannableStringBuilderAppend.append(']');
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), 0, strM11020.length(), 17);
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(-5592406), length, spannableStringBuilderAppend.length(), 17);
        activityC10227.f30725.setText(spannableStringBuilderAppend);
        ProgressBar progressBar = activityC10227.f30809;
        long j2 = this.f26866;
        progressBar.setProgress(j2 > 0 ? (int) ((j * 1000) / j2) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01fb A[PHI: r3
      0x01fb: PHI (r3v11 long) = (r3v9 long), (r3v10 long) binds: [B:80:0x01f9, B:83:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f26877) {
            ActivityC10227 activityC10227 = this.f26874;
            if (!activityC10227.f30726) {
                int i = this.f26873;
                AudioManager audioManager = this.f26878;
                if (i == -1) {
                    if (motionEvent != null && (motionEvent.getY() > activityC10227.f30827.getHeight() * 0.9f || motionEvent.getY() < activityC10227.f30827.getHeight() * 0.1f)) {
                        this.f26873 = -2;
                    } else if (Math.abs(f) > Math.abs(f2)) {
                        if (activityC10227.f30745) {
                            this.f26873 = -2;
                            return false;
                        }
                        long duration = activityC10227.f30786.getDuration();
                        this.f26866 = duration;
                        if (duration == -9223372036854775807L) {
                            this.f26873 = -2;
                        } else {
                            activityC10227.f30741.setVisibility(8);
                            this.f26873 = 0;
                            long currentPosition = activityC10227.f30786.getCurrentPosition();
                            this.f26876 = currentPosition;
                            this.f26863 = currentPosition;
                            ActivityC10227.m25788(activityC10227);
                            m22784(this.f26876);
                            if (ActivityC10227.m25687(activityC10227, this.f26876, true, true) == null) {
                                activityC10227.m25830();
                            }
                        }
                    } else {
                        ActivityC10227.m25756(activityC10227);
                        activityC10227.f30741.setVisibility(0);
                        activityC10227.f30765.setVisibility(8);
                        activityC10227.f30735.setVisibility(0);
                        this.f26865 = motionEvent2.getY();
                        if (motionEvent2.getX() < activityC10227.f30827.getWidth() / 2.0f) {
                            this.f26873 = 1;
                            float f3 = activityC10227.getWindow().getAttributes().screenBrightness;
                            if (f3 == -1.0f) {
                                f3 = Settings.System.getInt(activityC10227.getContentResolver(), "screen_brightness", q.h) / 255.0f;
                            }
                            this.f26867 = f3;
                        } else {
                            this.f26873 = 2;
                            if (audioManager != null) {
                                this.f26869 = audioManager.getStreamVolume(3);
                                this.f26870 = audioManager.getStreamMaxVolume(3);
                            }
                        }
                    }
                }
                int i2 = this.f26873;
                if (i2 != 0) {
                    int i3 = this.f26875;
                    if (i2 == 1) {
                        float y = this.f26867 - ((motionEvent2.getY() - this.f26865) / i3);
                        if (y < 0.0f) {
                            y = 0.0f;
                        } else if (y > 1.0f) {
                            y = 1.0f;
                        }
                        WindowManager.LayoutParams attributes = activityC10227.getWindow().getAttributes();
                        if (attributes.screenBrightness != y) {
                            attributes.screenBrightness = y;
                            activityC10227.getWindow().setAttributes(attributes);
                        }
                        int i4 = (int) (y * 1000.0f);
                        if (i4 == 0) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 333) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else if (i4 < 666) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        }
                        activityC10227.f30774.setProgress(i4);
                        return true;
                    }
                    if (i2 == 2) {
                        float y2 = motionEvent2.getY() - this.f26865;
                        int i5 = this.f26870;
                        int i6 = (int) (this.f26869 - ((y2 / i3) * i5));
                        if (i6 < 0) {
                            i6 = 0;
                        } else if (i6 > i5) {
                            i6 = i5;
                        }
                        int i7 = (i6 * 1000) / i5;
                        if (i7 == 0) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 333) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else if (i7 < 666) {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        } else {
                            activityC10227.f30735.setImageResource(R.drawable.MT_Protector);
                        }
                        if (audioManager != null) {
                            audioManager.setStreamVolume(3, i6, 0);
                        }
                        activityC10227.f30774.setProgress(i7);
                        return true;
                    }
                } else {
                    long jM27878 = this.f26876 - ((long) ((f / C11266.m27878(3.0f)) * 1000.0f));
                    long j = 0;
                    if (jM27878 < 0) {
                        jM27878 = j;
                    } else {
                        j = this.f26866;
                        if (jM27878 > j) {
                            jM27878 = j;
                        }
                    }
                    this.f26876 = jM27878;
                    m22784(jM27878);
                    if (ActivityC10227.m25687(activityC10227, jM27878, true, false) == null) {
                        activityC10227.m25830();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ActivityC10227 activityC10227 = this.f26874;
        if (ActivityC10227.m25730(activityC10227) || activityC10227.f30745) {
            return;
        }
        if (activityC10227.f30786.isPlaying() || (activityC10227.f30786.mo4603() == 3 && activityC10227.f30786.mo4607())) {
            activityC10227.f30827.m43231();
            this.f26872 = true;
            activityC10227.f30819.setVisibility(0);
            float f = activityC10227.f30786.mo4599().f8510;
            this.f26879 = f;
            float fMax = Math.max(2.0f, f * 2.0f);
            ((TextView) activityC10227.f30819.getChildAt(3)).setText(new DecimalFormat("0.0##X").format(fMax));
            activityC10227.f30786.mo4568(new C2730(fMax));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m22783(0), m22783(1), m22783(2));
            animatorSet.setDuration(800L);
            animatorSet.start();
            this.f26864 = animatorSet;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m22783(int i) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f26874.f30819.getChildAt(i), "alpha", 1.0f, 0.5f, 0.2f, 0.2f, 0.5f, 1.0f);
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
