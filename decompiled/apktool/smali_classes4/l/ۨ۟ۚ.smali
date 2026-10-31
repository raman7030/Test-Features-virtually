.class public final Ll/ۨ۟ۚ;
.super Ll/ܰ۟ۚ;
.source "A7FF"


# instance fields
.field public ᩶:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ᩳ֫֨;II)V
    .locals 0

    .line 162
    invoke-direct {p0, p1}, Ll/ܰ۟ۚ;-><init>(Ll/ᩳ֫֨;)V

    .line 163
    iput p2, p0, Ll/ۨ۟ۚ;->᩶:I

    .line 164
    iput p3, p0, Ll/ۨ۟ۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ۨ۟ۚ;->᩶:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨ۟ۚ;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 169
    check-cast p1, Ll/ۛ۫ۚ;

    iget v0, p0, Ll/ۨ۟ۚ;->᩶:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 170
    iget v0, p0, Ll/ۨ۟ۚ;->᩹:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 4

    .line 185
    iget v0, p0, Ll/ۨ۟ۚ;->᩶:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۨ۟ۚ;->᩹:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v0, "{ type_parameter_index: %d; bound_index: %d; }"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
