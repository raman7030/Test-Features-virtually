.class public final Ll/۠ۨᩳ;
.super Ljava/lang/Object;
.source "X68P"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:Ll/۟᩺ᩳ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 1

    .line 1256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1257
    invoke-static {p1}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ۨᩳ;->ܿ:Ll/۟᩺ᩳ;

    .line 1258
    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iput v0, p0, Ll/۠ۨᩳ;->ᩳ:I

    .line 1259
    iget v0, p1, Ll/۫ۨᩳ;->ۢ֫:I

    iput v0, p0, Ll/۠ۨᩳ;->ܽ:I

    .line 1260
    invoke-static {p1}, Ll/۫ۨᩳ;->ܿ֫(Ll/۫ۨᩳ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iput v0, p0, Ll/۠ۨᩳ;->֫:I

    .line 3922
    iget-object p1, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object p1, p1, Ll/᩺֫ܿ;->᩸ۧ:Ljava/lang/String;

    .line 1261
    iput-object p1, p0, Ll/۠ۨᩳ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ۨᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۨᩳ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/۠ۨᩳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۨᩳ;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۠ۨᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۨᩳ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/۠ۨᩳ;)Ll/۟᩺ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۨᩳ;->ܿ:Ll/۟᩺ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/۠ۨᩳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۠ۨᩳ;->ᩳ:I

    return p0
.end method
