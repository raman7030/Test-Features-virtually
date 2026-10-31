.class public final Ll/ᩳܽۜ;
.super Ll/᩷ᩳܽ;
.source "Q77G"


# instance fields
.field public final ۗ:Z

.field public final ۙ:Z

.field public final ۛ:Z

.field public final ۤ:Ljava/util/ArrayList;

.field public final ۫:Z

.field public final ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۜ᩻ܽ;IZZZZILjava/util/ArrayList;)V
    .locals 0

    .line 251
    invoke-direct {p0, p1, p2}, Ll/᩷ᩳܽ;-><init>(Ll/ۜ᩻ܽ;I)V

    .line 252
    invoke-interface {p1, p2}, Ll/ۜ᩻ܽ;->ܽ(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳܽۜ;->۬:Ljava/lang/String;

    .line 253
    iput-boolean p3, p0, Ll/ᩳܽۜ;->ۗ:Z

    .line 254
    iput-boolean p4, p0, Ll/ᩳܽۜ;->۫:Z

    .line 255
    iput-boolean p5, p0, Ll/ᩳܽۜ;->ۛ:Z

    .line 256
    iput-boolean p6, p0, Ll/ᩳܽۜ;->ۙ:Z

    .line 257
    iput p7, p0, Ll/᩷ᩳܽ;->᩶:I

    .line 258
    iput-object p8, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳܽۜ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final getValue()Ll/֨᩻ܽ;
    .locals 2

    .line 263
    iget-object v0, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨᩻ܽ;

    return-object v0
.end method

.method public final getValue(I)Ll/֨᩻ܽ;
    .locals 1

    .line 268
    iget-object v0, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨᩻ܽ;

    return-object p1
.end method

.method public final values()Ljava/lang/Iterable;
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۛ֫()Z
    .locals 1

    .line 288
    iget-boolean v0, p0, Ll/ᩳܽۜ;->۫:Z

    return v0
.end method

.method public final ۟֫()Ljava/lang/String;
    .locals 1

    .line 278
    iget-object v0, p0, Ll/ᩳܽۜ;->۬:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final ܰ()Z
    .locals 1

    .line 298
    iget-boolean v0, p0, Ll/ᩳܽۜ;->ۙ:Z

    return v0
.end method

.method public final ܽ֫()I
    .locals 1

    .line 273
    iget-object v0, p0, Ll/ᩳܽۜ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 293
    iget-boolean v0, p0, Ll/ᩳܽۜ;->ۛ:Z

    return v0
.end method

.method public final ᩻֫()Z
    .locals 1

    .line 283
    iget-boolean v0, p0, Ll/ᩳܽۜ;->ۗ:Z

    return v0
.end method
