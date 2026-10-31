.class public final Ll/ۜ᩹ۧ;
.super Ll/ۗ᩸ۧ;
.source "X61N"


# instance fields
.field public ۟֫:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f0403c9

    const v1, 0x101008b

    .line 55
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/ۗ᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Ll/ۜ᩹ۧ;->۟֫:Z

    return-void
.end method


# virtual methods
.method public final ۛ()V
    .locals 1

    .line 61
    invoke-virtual {p0}, Ll/֫᩸ۧ;->᩷()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/֫᩸ۧ;->ܿ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۗ᩸ۧ;->ۢ֫()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ᩴ()Ll/ܿ᩹ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ᩹ۧ;->ܽ()Ll/ܽ᩹ۧ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 67
    invoke-interface {v0, p0}, Ll/ܽ᩹ۧ;->֫(Ll/ۜ᩹ۧ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܺ֫()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/ۜ᩹ۧ;->۟֫:Z

    return v0
.end method
