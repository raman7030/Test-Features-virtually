.class public final Ll/ۖᩳᩳ;
.super Ljava/lang/Object;
.source "KAZI"


# instance fields
.field public ֫:I

.field public final ۧ:Ll/ܶܽᩳ;

.field public ܽ:Ll/ܶܽᩳ;

.field public final ܿ:Ll/ܺܳᩳ;

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Ll/ܺܳᩳ;Ll/ܶܽᩳ;Ll/ܶܽᩳ;[BI)V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    iput-object p1, p0, Ll/ۖᩳᩳ;->ܿ:Ll/ܺܳᩳ;

    .line 180
    iput-object p2, p0, Ll/ۖᩳᩳ;->ۧ:Ll/ܶܽᩳ;

    .line 181
    iput-object p3, p0, Ll/ۖᩳᩳ;->ܽ:Ll/ܶܽᩳ;

    .line 182
    iput-object p4, p0, Ll/ۖᩳᩳ;->ᩳ:[B

    .line 183
    iput p5, p0, Ll/ۖᩳᩳ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    .line 189
    :cond_0
    instance-of v0, p1, Ll/ۖᩳᩳ;

    if-nez v0, :cond_1

    goto :goto_0

    .line 191
    :cond_1
    check-cast p1, Ll/ۖᩳᩳ;

    .line 192
    iget-object v0, p0, Ll/ۖᩳᩳ;->ܿ:Ll/ܺܳᩳ;

    iget-object v1, p1, Ll/ۖᩳᩳ;->ܿ:Ll/ܺܳᩳ;

    invoke-virtual {v0, v1}, Ll/ܺܳᩳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 193
    :cond_2
    iget-object v0, p0, Ll/ۖᩳᩳ;->ۧ:Ll/ܶܽᩳ;

    iget-object v1, p1, Ll/ۖᩳᩳ;->ۧ:Ll/ܶܽᩳ;

    if-eq v0, v1, :cond_3

    goto :goto_0

    .line 194
    :cond_3
    iget-object v0, p0, Ll/ۖᩳᩳ;->ܽ:Ll/ܶܽᩳ;

    iget-object v1, p1, Ll/ۖᩳᩳ;->ܽ:Ll/ܶܽᩳ;

    if-eq v0, v1, :cond_4

    goto :goto_0

    .line 195
    :cond_4
    iget-object v0, p0, Ll/ۖᩳᩳ;->ᩳ:[B

    iget-object v1, p1, Ll/ۖᩳᩳ;->ᩳ:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    .line 196
    :cond_5
    iget v0, p0, Ll/ۖᩳᩳ;->֫:I

    iget p1, p1, Ll/ۖᩳᩳ;->֫:I

    if-eq v0, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method
