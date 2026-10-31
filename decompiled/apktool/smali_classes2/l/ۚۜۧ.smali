.class public final Ll/ۚۜۧ;
.super Ljava/lang/Object;
.source "J8I9"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/nio/FloatBuffer;

.field public final ܽ:Ljava/nio/FloatBuffer;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ᩴۜۧ;)V
    .locals 2

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    iget-object v0, p1, Ll/ᩴۜۧ;->ᩳ:[F

    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    .line 225
    iput v1, p0, Ll/ۚۜۧ;->ᩳ:I

    .line 226
    invoke-static {v0}, Ll/ۘۚ֫;->֫([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜۧ;->ܽ:Ljava/nio/FloatBuffer;

    .line 227
    iget-object v0, p1, Ll/ᩴۜۧ;->ۧ:[F

    invoke-static {v0}, Ll/ۘۚ֫;->֫([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۜۧ;->ۧ:Ljava/nio/FloatBuffer;

    .line 228
    iget p1, p1, Ll/ᩴۜۧ;->֫:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x4

    .line 237
    iput p1, p0, Ll/ۚۜۧ;->֫:I

    return-void

    :cond_0
    const/4 p1, 0x6

    .line 233
    iput p1, p0, Ll/ۚۜۧ;->֫:I

    return-void

    :cond_1
    const/4 p1, 0x5

    .line 230
    iput p1, p0, Ll/ۚۜۧ;->֫:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۜۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۜۧ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚۜۧ;)Ljava/nio/FloatBuffer;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۜۧ;->ۧ:Ljava/nio/FloatBuffer;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۚۜۧ;)Ljava/nio/FloatBuffer;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚۜۧ;->ܽ:Ljava/nio/FloatBuffer;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۚۜۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۚۜۧ;->ᩳ:I

    return p0
.end method
