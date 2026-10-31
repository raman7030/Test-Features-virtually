.class public final Ll/۟᩻ۘ;
.super Ljava/lang/Object;
.source "27ZX"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:[Ll/ܰ᩻ۘ;

.field public final synthetic ᩳ:Ll/֫ۜۘ;


# direct methods
.method public constructor <init>(Ll/֫ۜۘ;)V
    .locals 3

    .line 1161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩻ۘ;->ᩳ:Ll/֫ۜۘ;

    const/16 p1, 0x10

    new-array p1, p1, [Ll/ܰ᩻ۘ;

    .line 1162
    iput-object p1, p0, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1163
    :goto_0
    iget-object v1, p0, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 1164
    new-instance v2, Ll/ܰ᩻ۘ;

    .line 1152
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1164
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1170
    :cond_0
    iput p1, p0, Ll/۟᩻ۘ;->֫:I

    iput p1, p0, Ll/۟᩻ۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ܰ᩻ۘ;
    .locals 8

    .line 1186
    iget v0, p0, Ll/۟᩻ۘ;->֫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۟᩻ۘ;->֫:I

    .line 1187
    iget v0, p0, Ll/۟᩻ۘ;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    .line 1188
    iput v1, p0, Ll/۟᩻ۘ;->ۧ:I

    .line 1189
    iget-object v2, p0, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v3, v2

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    .line 1190
    iput v4, p0, Ll/۟᩻ۘ;->ۧ:I

    .line 1191
    :cond_0
    aget-object v0, v2, v0

    iget v1, v0, Ll/ܰ᩻ۘ;->֫:I

    if-eq v1, p1, :cond_6

    const-wide v0, 0x7fffffffffffffffL

    const/4 v3, 0x0

    .line 1236
    :goto_0
    array-length v5, v2

    if-ge v3, v5, :cond_3

    .line 1237
    aget-object v5, v2, v3

    iget v6, v5, Ll/ܰ᩻ۘ;->֫:I

    if-nez v6, :cond_1

    goto :goto_1

    .line 1239
    :cond_1
    iget-wide v5, v5, Ll/ܰ᩻ۘ;->ܽ:J

    cmp-long v7, v0, v5

    if-lez v7, :cond_2

    move-wide v0, v5

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    .line 1194
    :goto_2
    array-length v5, v2

    if-ge v3, v5, :cond_5

    .line 1195
    aget-object v5, v2, v3

    iget v6, v5, Ll/ܰ᩻ۘ;->֫:I

    if-eq v6, p1, :cond_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1197
    :cond_4
    iput v4, v5, Ll/ܰ᩻ۘ;->֫:I

    .line 1202
    new-instance p1, Ll/᩺᩻ۘ;

    .line 1147
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 1148
    iput-wide v0, p1, Ll/᩺᩻ۘ;->᩸:J

    .line 1202
    throw p1

    .line 1203
    :cond_5
    new-instance v0, Ll/ܽۡۘ;

    const-string v1, "RequestQueue: unknown request id "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x4

    .line 1203
    invoke-direct {v0, v1, p1}, Ll/ܽۡۘ;-><init>(ILjava/lang/String;)V

    throw v0

    .line 1205
    :cond_6
    iput v4, v0, Ll/ܰ᩻ۘ;->֫:I

    return-object v0
.end method

.method public final ֫(Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V
    .locals 9

    .line 1218
    iget v0, p0, Ll/۟᩻ۘ;->֫:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 1220
    iget-object v3, p0, Ll/۟᩻ۘ;->ᩳ:Ll/֫ۜۘ;

    invoke-static {v3, p1, p2}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;Ll/ܺ᩻ۘ;Ll/ۛ᩻ۘ;)V

    .line 1221
    iget v4, p2, Ll/ۛ᩻ۘ;->֫:I

    const/4 v5, 0x0

    .line 1222
    :goto_1
    iget-object v6, p0, Ll/۟᩻ۘ;->ܽ:[Ll/ܰ᩻ۘ;

    array-length v7, v6

    if-ge v5, v7, :cond_1

    .line 1223
    aget-object v6, v6, v5

    iget v7, v6, Ll/ܰ᩻ۘ;->֫:I

    iget v8, p2, Ll/ۛ᩻ۘ;->ۧ:I

    if-ne v7, v8, :cond_0

    .line 1224
    iput v1, v6, Ll/ܰ᩻ۘ;->֫:I

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    int-to-long v4, v4

    .line 1228
    invoke-static {v3, v4, v5}, Ll/֫ۜۘ;->֫(Ll/֫ۜۘ;J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1170
    :cond_2
    iput v1, p0, Ll/۟᩻ۘ;->֫:I

    iput v1, p0, Ll/۟᩻ۘ;->ۧ:I

    return-void
.end method
