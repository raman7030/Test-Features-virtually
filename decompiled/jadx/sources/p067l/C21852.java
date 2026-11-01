package p067l;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes5.dex */
public class C21852 extends AbstractC25101 implements InterfaceC22523 {

    /* JADX INFO: renamed from: ܽ */
    public static final C12865 f68752;

    /* JADX INFO: renamed from: ᩳ */
    public static final C18724 f68753;

    /* JADX INFO: renamed from: ֫ */
    public int f68754;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f68755;

    public C21852(boolean z) {
        this.f68755 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m49291() {
        return Arrays.asList(new C9877(), C7469.m17240(new C17827()), C11890.m27206(new C21545()), C5419.m11894(new C5088()), C11123.m25651(this), C25181.m55247(new C16582(LinkMovementMethod.getInstance())), this);
    }

    static {
        C9770 c9770 = new C9770(new File(C7050.m16229(), "markwon"));
        C19395 c19395M42717 = C7050.m16220().m42717();
        c19395M42717.m44149(c9770);
        f68753 = c19395M42717.m44143();
        C4147 c4147 = new C4147();
        TimeUnit timeUnit = TimeUnit.DAYS;
        c4147.m8400();
        c4147.m8401();
        f68752 = c4147.m8399();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17724 m49285(Context context, boolean z) {
        InterfaceC11020 interfaceC11020M40278 = AbstractC17724.m40278(context);
        interfaceC11020M40278.mo10552(new C21852(z).m49291());
        return interfaceC11020M40278.build();
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public void mo17756(C5223 c5223) {
        c5223.m11219(C13076.m29939(5.0f));
        c5223.m11216();
        c5223.m11215(C23223.f72994);
        boolean z = this.f68755;
        c5223.m11221(!z ? 1 : 0);
        c5223.m11212(C23223.f72994);
        c5223.m11220(1);
        c5223.m11211(!z ? new float[]{1.8f, 1.5f, 1.25f, 1.1f, 1.0f, 0.9f} : new float[]{1.5f, 1.35f, 1.2f, 1.1f, 1.0f, 0.9f});
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ۧ */
    public final void mo17758(TextView textView) {
        this.f68754 = textView == null ? 0 : textView.getLineHeight() - textView.getPaint().getFontMetricsInt(null);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11896(final TextView textView, SpannableStringBuilder spannableStringBuilder) {
        final MovementMethod movementMethod = textView.getMovementMethod();
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩵᩻ۡ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                TextView textView2 = textView;
                MovementMethod movementMethod2 = textView2.getMovementMethod();
                MovementMethod movementMethod3 = movementMethod;
                if (movementMethod2 == movementMethod3) {
                    return false;
                }
                textView2.setMovementMethod(movementMethod3);
                return false;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public float mo21794(AbstractC2555 abstractC2555) {
        if (!(abstractC2555 instanceof C8591)) {
            return 0.4f;
        }
        int iM20004 = ((C8591) abstractC2555).m20004();
        if (iM20004 == 1) {
            return 2.0f;
        }
        if (iM20004 != 2) {
            return iM20004 != 3 ? 0.4f : 0.75f;
        }
        return 1.0f;
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo17244(InterfaceC21749 interfaceC21749) {
        interfaceC21749.mo28451(new C3075(this));
        interfaceC21749.mo28450(C15966.class, new InterfaceC6996() { // from class: l.ۘ᩻ۡ
            @Override // p067l.InterfaceC6996
            /* JADX INFO: renamed from: ֫ */
            public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
                C15966 c15966 = (C15966) abstractC2555;
                this.f16632.m49286(interfaceC5655, c15966.m36275(), c15966.m36274(), c15966);
            }
        });
        interfaceC21749.mo28450(C17307.class, new InterfaceC6996() { // from class: l.ᩴ᩻ۡ
            @Override // p067l.InterfaceC6996
            /* JADX INFO: renamed from: ֫ */
            public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
                C17307 c17307 = (C17307) abstractC2555;
                this.f63362.m49286(interfaceC5655, null, c17307.m39262(), c17307);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m49286(InterfaceC5655 interfaceC5655, String str, String str2, AbstractC13147 abstractC13147) {
        interfaceC5655.mo12600(abstractC13147);
        C19304 c19304Builder = interfaceC5655.builder();
        int length = interfaceC5655.length();
        int iM33409 = interfaceC5655.mo12595().m46081().m33409();
        c19304Builder.append('\n');
        c19304Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM33409 - this.f68754, 0)), c19304Builder.length() - 1, c19304Builder.length(), 33);
        interfaceC5655.mo12595().m46077().getClass();
        c19304Builder.append((CharSequence) str2);
        c19304Builder.append('\n');
        c19304Builder.setSpan(new AbsoluteSizeSpan(Math.max(iM33409 - (this.f68754 * 2), 0)), c19304Builder.length() - 1, c19304Builder.length(), 33);
        AbstractC6564.f16935.m31139(interfaceC5655.mo12591(), str);
        interfaceC5655.mo12593(abstractC13147, length);
        interfaceC5655.mo12598(abstractC13147);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11898(C6326 c6326) {
        c6326.m14470(new C7770(4));
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo11428(View view, String str) {
        if (str.startsWith("open://")) {
            Activity activityM17221 = C7453.m17221(view.getContext());
            if (activityM17221 instanceof AbstractActivityC5549) {
                new C17156((AbstractActivityC5549) activityM17221, C21459.m48621(4, str, new StringBuilder(C0171b.f688a))).m22250();
            }
            return true;
        }
        if (str.startsWith("copy://")) {
            C7050.m16211((CharSequence) str.substring(7));
            return true;
        }
        if (str.startsWith("toast://")) {
            C22682.m50795((CharSequence) str.substring(8));
            return true;
        }
        if (!str.startsWith("toastl://")) {
            return false;
        }
        C22682.m50800(str.substring(9));
        return true;
    }
}
