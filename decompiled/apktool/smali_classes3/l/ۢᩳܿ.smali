.class public final Ll/ۢᩳܿ;
.super Ll/᩵ܽܿ;
.source "97UL"


# instance fields
.field public ܽ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 365
    invoke-direct {p0, p1}, Ll/᩵ܽܿ;-><init>(Ljava/lang/String;)V

    .line 366
    iput p2, p0, Ll/ۢᩳܿ;->ܽ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢᩳܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۢᩳܿ;->ܽ:I

    return p0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 371
    iget v0, p0, Ll/ۢᩳܿ;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۢᩳܿ;->ܽ:I

    return-void
.end method

.method public final ܽ()Z
    .locals 3

    .line 376
    invoke-virtual {p0}, Ll/᩵ܽܿ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/16 v2, 0x64

    if-gt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
