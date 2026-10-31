.class public final Ll/ۤᩴۢ;
.super Ljava/lang/Object;
.source "V7AU"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:[Ljava/lang/Object;

.field public final ܿ:Z

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ZLjava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 2027
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2028
    iput-boolean p1, p0, Ll/ۤᩴۢ;->ܿ:Z

    .line 2029
    iput-object p2, p0, Ll/ۤᩴۢ;->֫:Ljava/lang/String;

    .line 2030
    iput p3, p0, Ll/ۤᩴۢ;->ᩳ:I

    .line 2031
    iput-object p4, p0, Ll/ۤᩴۢ;->ۧ:Ljava/lang/String;

    .line 2032
    iput-object p5, p0, Ll/ۤᩴۢ;->ܽ:[Ljava/lang/Object;

    return-void
.end method

.method public static ֫()Ll/ۤᩴۢ;
    .locals 7

    .line 2047
    new-instance v6, Ll/ۤᩴۢ;

    const/4 v1, 0x0

    new-array v5, v1, [Ljava/lang/Object;

    const-string v2, ""

    const v3, 0x7f120811

    const-string v4, "pairing_code_invalid"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤᩴۢ;-><init>(ZLjava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    return-object v6
.end method

.method public static varargs ֫(I[Ljava/lang/Object;)Ll/ۤᩴۢ;
    .locals 7

    .line 2040
    new-instance v6, Ll/ۤᩴۢ;

    const-string v2, ""

    const-string v4, ""

    const/4 v1, 0x0

    move-object v0, v6

    move v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/ۤᩴۢ;-><init>(ZLjava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    return-object v6
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۤᩴۢ;
    .locals 7

    .line 2036
    new-instance v6, Ll/ۤᩴۢ;

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v3, 0x0

    const-string v4, ""

    move-object v0, v6

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Ll/ۤᩴۢ;-><init>(ZLjava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    return-object v6
.end method
