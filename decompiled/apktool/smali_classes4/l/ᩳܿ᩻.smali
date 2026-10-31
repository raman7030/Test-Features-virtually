.class public final Ll/ᩳܿ᩻;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public final ֫:[I

.field public ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public ܽ:I

.field public final ܿ:[C

.field public ᩳ:I

.field public final ᩻:Ll/ܿܿ᩻;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܿܿ᩻;)V
    .locals 4

    .line 1162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1163
    iput-object p1, p0, Ll/ᩳܿ᩻;->ܳ:Ljava/lang/String;

    .line 1164
    iput-object p2, p0, Ll/ᩳܿ᩻;->᩻:Ll/ܿܿ᩻;

    .line 1201
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    new-array p2, p2, [I

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1203
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 1204
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_1
    if-lez v0, :cond_0

    .line 1205
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    .line 1206
    aget v0, p2, v0

    goto :goto_1

    .line 1208
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 1211
    :cond_1
    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1165
    :cond_2
    iput-object p2, p0, Ll/ᩳܿ᩻;->֫:[I

    .line 1166
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-array p1, p1, [C

    iput-object p1, p0, Ll/ᩳܿ᩻;->ܿ:[C

    return-void
.end method

.method private ֫(I)V
    .locals 4

    .line 1231
    :goto_0
    iget v0, p0, Ll/ᩳܿ᩻;->ܽ:I

    if-le v0, p1, :cond_2

    if-eqz v0, :cond_1

    .line 1243
    iget v1, p0, Ll/ᩳܿ᩻;->ۧ:I

    iget-object v2, p0, Ll/ᩳܿ᩻;->ܿ:[C

    aget-char v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    .line 1273
    array-length v2, v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 1244
    :cond_0
    iput v1, p0, Ll/ᩳܿ᩻;->ۧ:I

    add-int/lit8 v0, v0, -0x1

    .line 1245
    iput v0, p0, Ll/ᩳܿ᩻;->ܽ:I

    .line 1232
    iget-object v0, p0, Ll/ᩳܿ᩻;->᩻:Ll/ܿܿ᩻;

    invoke-virtual {v0, v3}, Ll/ܿܿ᩻;->֫(C)V

    goto :goto_0

    .line 1241
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Separator matcher buffer is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 1193
    invoke-direct {p0, v0}, Ll/ᩳܿ᩻;->֫(I)V

    .line 1194
    iput v0, p0, Ll/ᩳܿ᩻;->ᩳ:I

    return-void
.end method

.method public final ֫(C)V
    .locals 4

    .line 1220
    iget v0, p0, Ll/ᩳܿ᩻;->ܽ:I

    iget-object v1, p0, Ll/ᩳܿ᩻;->ܿ:[C

    array-length v2, v1

    if-eq v0, v2, :cond_4

    .line 1261
    iget v2, p0, Ll/ᩳܿ᩻;->ۧ:I

    add-int/2addr v2, v0

    .line 1262
    array-length v3, v1

    if-lt v2, v3, :cond_0

    .line 1263
    array-length v3, v1

    sub-int/2addr v2, v3

    .line 1223
    :cond_0
    aput-char p1, v1, v2

    add-int/lit8 v0, v0, 0x1

    .line 1224
    iput v0, p0, Ll/ᩳܿ᩻;->ܽ:I

    .line 1174
    :goto_0
    iget v0, p0, Ll/ᩳܿ᩻;->ᩳ:I

    iget-object v1, p0, Ll/ᩳܿ᩻;->ܳ:Ljava/lang/String;

    if-lez v0, :cond_1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, p1, :cond_1

    .line 1175
    iget v0, p0, Ll/ᩳܿ᩻;->ᩳ:I

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Ll/ᩳܿ᩻;->֫:[I

    aget v0, v1, v0

    iput v0, p0, Ll/ᩳܿ᩻;->ᩳ:I

    goto :goto_0

    .line 1177
    :cond_1
    iget v0, p0, Ll/ᩳܿ᩻;->ᩳ:I

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_2

    .line 1178
    iget p1, p0, Ll/ᩳܿ᩻;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩳܿ᩻;->ᩳ:I

    .line 1180
    :cond_2
    iget p1, p0, Ll/ᩳܿ᩻;->ᩳ:I

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p1, v0, :cond_3

    const/4 p1, 0x0

    .line 1253
    iput p1, p0, Ll/ᩳܿ᩻;->ۧ:I

    .line 1254
    iput p1, p0, Ll/ᩳܿ᩻;->ܽ:I

    .line 1182
    iget-object v0, p0, Ll/ᩳܿ᩻;->᩻:Ll/ܿܿ᩻;

    invoke-virtual {v0, v1}, Ll/ܿܿ᩻;->֫(Ljava/lang/String;)V

    .line 1183
    iput p1, p0, Ll/ᩳܿ᩻;->ᩳ:I

    return-void

    .line 1186
    :cond_3
    iget p1, p0, Ll/ᩳܿ᩻;->ᩳ:I

    invoke-direct {p0, p1}, Ll/ᩳܿ᩻;->֫(I)V

    return-void

    .line 1221
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Separator matcher buffer is full"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
