.class public final Ll/۠ۖۧ;
.super Ljava/lang/Object;
.source "U8RL"

# interfaces
.implements Ll/᩵ۖۧ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ᩳ֨֫;

.field public final ܽ:I

.field public ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/۠֨֫;)V
    .locals 1

    .line 2865
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2866
    iget-object p1, p1, Ll/۠֨֫;->ۧ:Ll/ᩳ֨֫;

    iput-object p1, p0, Ll/۠ۖۧ;->ۧ:Ll/ᩳ֨֫;

    const/16 v0, 0xc

    .line 2867
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2868
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ll/۠ۖۧ;->ܽ:I

    .line 2869
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩹()I

    move-result p1

    iput p1, p0, Ll/۠ۖۧ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 3

    const/16 v0, 0x8

    .line 2884
    iget-object v1, p0, Ll/۠ۖۧ;->ۧ:Ll/ᩳ֨֫;

    iget v2, p0, Ll/۠ۖۧ;->ܽ:I

    if-ne v2, v0, :cond_0

    .line 2885
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0x10

    if-ne v2, v0, :cond_1

    .line 2887
    invoke-virtual {v1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    return v0

    .line 2890
    :cond_1
    iget v0, p0, Ll/۠ۖۧ;->ܿ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/۠ۖۧ;->ܿ:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    .line 2892
    invoke-virtual {v1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    iput v0, p0, Ll/۠ۖۧ;->֫:I

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    return v0

    .line 2897
    :cond_2
    iget v0, p0, Ll/۠ۖۧ;->֫:I

    and-int/lit8 v0, v0, 0xf

    return v0
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 2874
    iget v0, p0, Ll/۠ۖۧ;->ᩳ:I

    return v0
.end method
