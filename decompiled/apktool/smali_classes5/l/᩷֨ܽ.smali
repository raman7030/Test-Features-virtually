.class public final Ll/᩷֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/᩹֡ܽ;


# instance fields
.field public final ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 2495
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2496
    iput p1, p0, Ll/᩷֨ܽ;->֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩷֨ܽ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩷֨ܽ;->֫:I

    return p0
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->֫(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 1

    .line 2501
    iget v0, p0, Ll/᩷֨ܽ;->֫:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->ۧ(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
