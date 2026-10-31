.class public final Ll/ܽ۬ܳ;
.super Ljava/lang/Object;
.source "Y5PI"

# interfaces
.implements Ll/ܳ۬ܳ;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ᩳ۬ܳ;


# direct methods
.method public constructor <init>(Ll/ᩳ۬ܳ;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۬ܳ;->᩹:Ll/ᩳ۬ܳ;

    const/4 p1, 0x1

    .line 136
    iput-boolean p1, p0, Ll/ܽ۬ܳ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final ۧ(I)V
    .locals 3

    const/4 v0, -0x1

    .line 140
    iget-object v1, p0, Ll/ܽ۬ܳ;->᩹:Ll/ᩳ۬ܳ;

    if-ne p1, v0, :cond_0

    .line 141
    iget-object p1, v1, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    const v0, 0x7f120b85

    invoke-virtual {p1, v0}, Ll/᩺ۤܿ;->֫(I)V

    return-void

    .line 143
    :cond_0
    iget-boolean v0, p0, Ll/ܽ۬ܳ;->᩸:Z

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, v1, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    const v2, 0x7f1207a7

    invoke-virtual {v0, v2}, Ll/᩺ۤܿ;->֫(I)V

    const/4 v0, 0x0

    .line 145
    iput-boolean v0, p0, Ll/ܽ۬ܳ;->᩸:Z

    .line 147
    :cond_1
    iget-object v0, v1, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 153
    iget-object v0, p0, Ll/ܽ۬ܳ;->᩹:Ll/ᩳ۬ܳ;

    iget-object v0, v0, Ll/ᩳ۬ܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method
