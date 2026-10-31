.class public final Ll/ܺ۠ܽ;
.super Ljava/lang/Object;
.source "56VG"


# instance fields
.field public final ֫:C

.field public final ۧ:Z

.field public final ܽ:I

.field public final ᩳ:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(Ll/᩻֨ܽ;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iget v0, p1, Ll/᩻֨ܽ;->ܽ:I

    iput v0, p0, Ll/ܺ۠ܽ;->ܽ:I

    .line 36
    iget-boolean v0, p1, Ll/᩻֨ܽ;->ۧ:Z

    iput-boolean v0, p0, Ll/ܺ۠ܽ;->ۧ:Z

    .line 37
    iget-char v0, p1, Ll/᩻֨ܽ;->֫:C

    iput-char v0, p0, Ll/ܺ۠ܽ;->֫:C

    .line 38
    iget-object p1, p1, Ll/᩻֨ܽ;->ᩳ:Ll/ۧۚܽ;

    iput-object p1, p0, Ll/ܺ۠ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Ll/ܺ۠ܽ;->ۧ:Z

    if-eqz v0, :cond_1

    iget-char v0, p0, Ll/ܺ۠ܽ;->֫:C

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Ll/ܺ۠ܽ;->ᩳ:Ll/ۧۚܽ;

    invoke-interface {v0, p1}, Ll/ۧۚܽ;->֫(I)Z

    move-result p1

    return p1
.end method
