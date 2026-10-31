.class public final Ll/ۚ۟֡;
.super Ljava/lang/Object;
.source "NAQ3"

# interfaces
.implements Ll/᩸֫ۚ;


# static fields
.field public static ᩶:Ll/֡ۛۡ;


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 9
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۚ۟֡;->᩶:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(II)Ll/ۚ۟֡;
    .locals 1

    .line 12
    sget-object v0, Ll/ۚ۟֡;->᩶:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟֡;

    if-eqz v0, :cond_0

    .line 14
    iput p0, v0, Ll/ۚ۟֡;->᩸:I

    .line 15
    iput p1, v0, Ll/ۚ۟֡;->᩹:I

    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ll/ۚ۟֡;

    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput p0, v0, Ll/ۚ۟֡;->᩸:I

    .line 31
    iput p1, v0, Ll/ۚ۟֡;->᩹:I

    return-object v0
.end method


# virtual methods
.method public final getLineNumber()I
    .locals 1

    .line 46
    iget v0, p0, Ll/ۚ۟֡;->᩹:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 23
    sget-object v0, Ll/ۚ۟֡;->᩶:Ll/֡ۛۡ;

    invoke-virtual {v0, p0}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 41
    iget v0, p0, Ll/ۚ۟֡;->᩸:I

    return v0
.end method
