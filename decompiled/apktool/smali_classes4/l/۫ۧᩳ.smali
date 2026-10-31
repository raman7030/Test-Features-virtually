.class public Ll/۫ۧᩳ;
.super Ljava/lang/Object;
.source "81VV"

# interfaces
.implements Ll/۬ۧᩳ;


# instance fields
.field public ᩸:Z

.field public final ᩹:Ll/۬ۧᩳ;


# direct methods
.method public constructor <init>(Ll/۬ۧᩳ;)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput-object p1, p0, Ll/۫ۧᩳ;->᩹:Ll/۬ۧᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 1

    .line 158
    iget-boolean v0, p0, Ll/۫ۧᩳ;->᩸:Z

    int-to-float p2, p2

    if-eqz v0, :cond_0

    const v0, 0x3e99999a    # 0.3f

    mul-float p2, p2, v0

    const/high16 v0, 0x428c0000    # 70.0f

    add-float/2addr p2, v0

    goto :goto_0

    :cond_0
    const v0, 0x3f333333    # 0.7f

    mul-float p2, p2, v0

    :goto_0
    float-to-int p2, p2

    .line 163
    iget-object v0, p0, Ll/۫ۧᩳ;->᩹:Ll/۬ۧᩳ;

    invoke-interface {v0, p1, p2}, Ll/۬ۧᩳ;->֫(II)V

    return-void
.end method

.method public final ֫(ZZ)V
    .locals 1

    const/4 v0, 0x1

    .line 152
    iput-boolean v0, p0, Ll/۫ۧᩳ;->᩸:Z

    .line 153
    iget-object v0, p0, Ll/۫ۧᩳ;->᩹:Ll/۬ۧᩳ;

    invoke-interface {v0, p1, p2}, Ll/۬ۧᩳ;->֫(ZZ)V

    return-void
.end method

.method public ۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 146
    iput-boolean v0, p0, Ll/۫ۧᩳ;->᩸:Z

    .line 147
    iget-object v0, p0, Ll/۫ۧᩳ;->᩹:Ll/۬ۧᩳ;

    invoke-interface {v0}, Ll/۬ۧᩳ;->ۙ()V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 168
    iget-object v0, p0, Ll/۫ۧᩳ;->᩹:Ll/۬ۧᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
