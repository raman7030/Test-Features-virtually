package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩻֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes.dex */
public final class C23359 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6426 f75037 = new C6426(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23359 m51769() {
        return new C23359();
    }

    public final C23359 clone() {
        C6426 c6426 = new C6426(0);
        if (this.f75037.f19872 == null) {
            c6426.f19872 = null;
        } else {
            c6426.f19872 = new ArrayList(this.f75037.f19872);
        }
        if (this.f75037.f19869 == null) {
            c6426.f19869 = null;
        } else {
            c6426.f19869 = new ArrayList(this.f75037.f19869);
        }
        if (this.f75037.f19870 == null) {
            c6426.f19870 = null;
        } else {
            c6426.f19870 = new ArrayList(this.f75037.f19870);
        }
        if (this.f75037.f19873 == null) {
            c6426.f19873 = null;
        } else {
            c6426.f19873 = new ArrayList(this.f75037.f19873);
        }
        if (this.f75037.f19871 == null) {
            c6426.f19871 = null;
        } else {
            c6426.f19871 = new ArrayList(this.f75037.f19871);
        }
        C23359 c23359 = new C23359();
        c23359.f75037 = c6426;
        return c23359;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6426 m51770() {
        C6426 c6426 = new C6426(0);
        if (this.f75037.f19872 == null) {
            c6426.f19872 = Collections.EMPTY_LIST;
        } else {
            c6426.f19872 = C20195.unmodifiableList(new ArrayList(this.f75037.f19872));
        }
        if (this.f75037.f19869 == null) {
            c6426.f19869 = Collections.EMPTY_LIST;
        } else {
            c6426.f19869 = C20195.unmodifiableList(new ArrayList(this.f75037.f19869));
        }
        if (this.f75037.f19870 == null) {
            c6426.f19870 = Collections.EMPTY_LIST;
        } else {
            c6426.f19870 = C20195.unmodifiableList(new ArrayList(this.f75037.f19870));
        }
        if (this.f75037.f19873 == null) {
            c6426.f19873 = Collections.EMPTY_LIST;
        } else {
            c6426.f19873 = C20195.unmodifiableList(new ArrayList(this.f75037.f19873));
        }
        if (this.f75037.f19871 == null) {
            c6426.f19871 = Collections.EMPTY_LIST;
            return c6426;
        }
        c6426.f19871 = C20195.unmodifiableList(new ArrayList(this.f75037.f19871));
        return c6426;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51774(C6426 c6426) {
        if (!c6426.f19872.isEmpty()) {
            if (this.f75037.f19872 == null) {
                this.f75037.f19872 = new ArrayList();
            }
            this.f75037.f19872.addAll(c6426.f19872);
        }
        if (!c6426.f19869.isEmpty()) {
            if (this.f75037.f19869 == null) {
                this.f75037.f19869 = new ArrayList();
            }
            this.f75037.f19869.addAll(c6426.f19869);
        }
        if (!c6426.f19870.isEmpty()) {
            if (this.f75037.f19870 == null) {
                this.f75037.f19870 = new ArrayList();
            }
            this.f75037.f19870.addAll(c6426.f19870);
        }
        if (!c6426.f19873.isEmpty()) {
            if (this.f75037.f19873 == null) {
                this.f75037.f19873 = new ArrayList();
            }
            this.f75037.f19873.addAll(c6426.f19873);
        }
        if (c6426.f19871.isEmpty()) {
            return;
        }
        if (this.f75037.f19871 == null) {
            this.f75037.f19871 = new ArrayList();
        }
        this.f75037.f19871.addAll(c6426.f19871);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51776(long j) {
        if (this.f75037.f19872 == null) {
            this.f75037.f19872 = new ArrayList();
        }
        this.f75037.f19872.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51771(int i) {
        if (this.f75037.f19869 == null) {
            this.f75037.f19869 = new ArrayList();
        }
        this.f75037.f19869.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51772(long j) {
        if (this.f75037.f19870 == null) {
            this.f75037.f19870 = new ArrayList();
        }
        this.f75037.f19870.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51773(AbstractC5886 abstractC5886) {
        if (this.f75037.f19873 == null) {
            this.f75037.f19873 = new ArrayList();
        }
        this.f75037.f19873.add(abstractC5886);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51775(C9249 c9249) {
        if (this.f75037.f19871 == null) {
            this.f75037.f19871 = new ArrayList();
        }
        this.f75037.f19871.add(c9249);
    }
}
