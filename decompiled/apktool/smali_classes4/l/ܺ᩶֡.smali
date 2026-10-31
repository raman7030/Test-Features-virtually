.class public final Ll/ܺ᩶֡;
.super Ljava/lang/Object;
.source "O69P"


# instance fields
.field public final ֫:Ll/᩺ۙ֡;

.field public ۧ:I


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V
    .locals 1

    .line 1226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1227
    iget-object p1, p1, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/᩺ۙ֡;

    iput-object p1, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    .line 1228
    invoke-virtual {p2}, Ll/ۧۗ֡;->ܳ()I

    move-result p1

    iput p1, p0, Ll/ܺ᩶֡;->ۧ:I

    return-void
.end method

.method public constructor <init>(Ll/᩺ۙ֡;I)V
    .locals 0

    .line 1214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1215
    iput-object p1, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    .line 1216
    iput p2, p0, Ll/ܺ᩶֡;->ۧ:I

    return-void
.end method

.method public static ֫(Ll/ܺ᩶֡;)I
    .locals 1

    .line 1235
    iget-object v0, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 1235
    invoke-static {v0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result v0

    iget p0, p0, Ll/ܺ᩶֡;->ۧ:I

    .line 1236
    invoke-static {p0}, Ll/ۧᩳܽ;->ۜ(I)I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static ֫(Ll/ܺ᩶֡;Ll/֫ۗ֡;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    iget-object v0, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 1252
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܳ(I)I

    .line 1253
    iget p0, p0, Ll/ܺ᩶֡;->ۧ:I

    invoke-virtual {p1, p0}, Ll/֫ۗ֡;->ܳ(I)I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 1271
    const-class v2, Ll/ܺ᩶֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 1275
    :cond_1
    check-cast p1, Ll/ܺ᩶֡;

    .line 1276
    iget-object v2, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    iget-object v3, p1, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܺ᩶֡;->ۧ:I

    iget p1, p1, Ll/ܺ᩶֡;->ۧ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1263
    iget-object v0, p0, Ll/ܺ᩶֡;->֫:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܺ᩶֡;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()I
    .locals 1

    .line 1258
    iget v0, p0, Ll/ܺ᩶֡;->ۧ:I

    return v0
.end method
