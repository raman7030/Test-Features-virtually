.class public final Ll/ܺۢۖ;
.super Ll/ۘᩴۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/۫֡ۖ;

.field public static final ۤ:Ll/ܺۢۖ;


# instance fields
.field public ۗ:Z

.field public ۙ:I

.field public volatile ۫:Ljava/lang/Object;

.field public ۬:Z

.field public ᩶:B

.field public ᩸:I

.field public volatile ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 9829
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܺۢۖ;

    .line 9835
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 9829
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 10722
    new-instance v0, Ll/ܺۢۖ;

    invoke-direct {v0}, Ll/ܺۢۖ;-><init>()V

    sput-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    .line 10730
    new-instance v0, Ll/ۢۢۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ܺۢۖ;->ۛ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 9841
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 9861
    iput v0, p0, Ll/ܺۢۖ;->ۙ:I

    const-string v1, ""

    .line 9880
    iput-object v1, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    .line 9929
    iput-object v1, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    .line 9978
    iput-boolean v0, p0, Ll/ܺۢۖ;->۬:Z

    .line 9997
    iput-boolean v0, p0, Ll/ܺۢۖ;->ۗ:Z

    const/4 v0, -0x1

    .line 10015
    iput-byte v0, p0, Ll/ܺۢۖ;->᩶:B

    .line 9842
    iput-object v1, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    .line 9843
    iput-object v1, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ۡۢۖ;I)V
    .locals 0

    .line 9839
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 9861
    iput p1, p0, Ll/ܺۢۖ;->ۙ:I

    const-string p2, ""

    .line 9880
    iput-object p2, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    .line 9929
    iput-object p2, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    .line 9978
    iput-boolean p1, p0, Ll/ܺۢۖ;->۬:Z

    .line 9997
    iput-boolean p1, p0, Ll/ܺۢۖ;->ۗ:Z

    const/4 p1, -0x1

    .line 10015
    iput-byte p1, p0, Ll/ܺۢۖ;->᩶:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܺۢۖ;
    .locals 1

    .line 10726
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ۡۢۖ;
    .locals 1

    .line 10224
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    invoke-virtual {v0}, Ll/ܺۢۖ;->toBuilder()Ll/ۡۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 10752
    sget-object v0, Ll/ܺۢۖ;->ۛ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/ܺۢۖ;)Ljava/lang/Object;
    .locals 0

    .line 9823
    iget-object p0, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܺۢۖ;I)V
    .locals 0

    .line 9823
    iput p1, p0, Ll/ܺۢۖ;->ۙ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۢۖ;Ljava/lang/Object;)V
    .locals 0

    .line 9823
    iput-object p1, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ll/ܺۢۖ;Z)V
    .locals 0

    .line 9823
    iput-boolean p1, p0, Ll/ܺۢۖ;->۬:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/ܺۢۖ;)Ljava/lang/Object;
    .locals 0

    .line 9823
    iget-object p0, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܺۢۖ;I)V
    .locals 1

    .line 9823
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ܺۢۖ;->᩸:I

    return-void
.end method

.method public static synthetic ۧ(Ll/ܺۢۖ;Ljava/lang/Object;)V
    .locals 0

    .line 9823
    iput-object p1, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۧ(Ll/ܺۢۖ;Z)V
    .locals 0

    .line 9823
    iput-boolean p1, p0, Ll/ܺۢۖ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto/16 :goto_1

    .line 10081
    :cond_0
    instance-of v0, p1, Ll/ܺۢۖ;

    if-nez v0, :cond_1

    .line 10082
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 10084
    :cond_1
    check-cast p1, Ll/ܺۢۖ;

    .line 10086
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۖ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܺۢۖ;->ۖ()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto/16 :goto_0

    .line 10087
    :cond_2
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9876
    iget v0, p0, Ll/ܺۢۖ;->ۙ:I

    iget v1, p1, Ll/ܺۢۖ;->ۙ:I

    if-eq v0, v1, :cond_3

    goto/16 :goto_0

    .line 10091
    :cond_3
    invoke-virtual {p0}, Ll/ܺۢۖ;->ܺ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܺۢۖ;->ܺ()Z

    move-result v1

    if-eq v0, v1, :cond_4

    goto/16 :goto_0

    .line 10092
    :cond_4
    invoke-virtual {p0}, Ll/ܺۢۖ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10093
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 10094
    invoke-virtual {p1}, Ll/ܺۢۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    .line 10096
    :cond_5
    invoke-virtual {p0}, Ll/ܺۢۖ;->hasType()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܺۢۖ;->hasType()Z

    move-result v1

    if-eq v0, v1, :cond_6

    goto :goto_0

    .line 10097
    :cond_6
    invoke-virtual {p0}, Ll/ܺۢۖ;->hasType()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 10098
    invoke-virtual {p0}, Ll/ܺۢۖ;->getType()Ljava/lang/String;

    move-result-object v0

    .line 10099
    invoke-virtual {p1}, Ll/ܺۢۖ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 10101
    :cond_7
    invoke-virtual {p0}, Ll/ܺۢۖ;->ᩴ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܺۢۖ;->ᩴ()Z

    move-result v1

    if-eq v0, v1, :cond_8

    goto :goto_0

    .line 10102
    :cond_8
    invoke-virtual {p0}, Ll/ܺۢۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 9993
    iget-boolean v0, p0, Ll/ܺۢۖ;->۬:Z

    iget-boolean v1, p1, Ll/ܺۢۖ;->۬:Z

    if-eq v0, v1, :cond_9

    goto :goto_0

    .line 10106
    :cond_9
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۘ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܺۢۖ;->ۘ()Z

    move-result v1

    if-eq v0, v1, :cond_a

    goto :goto_0

    .line 10107
    :cond_a
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 10012
    iget-boolean v0, p0, Ll/ܺۢۖ;->ۗ:Z

    iget-boolean v1, p1, Ll/ܺۢۖ;->ۗ:Z

    if-eq v0, v1, :cond_b

    goto :goto_0

    .line 10111
    :cond_b
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_c
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 10762
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 10762
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 10757
    sget-object v0, Ll/ܺۢۖ;->ۛ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 3

    .line 10049
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 10053
    :cond_0
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 10054
    iget v0, p0, Ll/ܺۢۖ;->ۙ:I

    .line 10055
    invoke-static {v1, v0}, Ll/ܳ᩷ۖ;->ܳ(II)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 10057
    :goto_0
    iget v1, p0, Ll/ܺۢۖ;->᩸:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 10058
    iget-object v1, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    invoke-static {v2, v1}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10060
    :cond_2
    iget v1, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 10061
    iget-object v2, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    invoke-static {v1, v2}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 10063
    :cond_3
    iget v1, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    const/4 v1, 0x5

    .line 10065
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 10067
    :cond_4
    iget v1, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_5

    const/4 v1, 0x6

    .line 10069
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 10071
    :cond_5
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 10072
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 9945
    iget-object v0, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    .line 9946
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9947
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 9949
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 9951
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 9952
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9953
    iput-object v1, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final hasType()Z
    .locals 1

    .line 9937
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 10117
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 9848
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->۠֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 10121
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 10122
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۖ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 10123
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 9876
    iget v1, p0, Ll/ܺۢۖ;->ۙ:I

    add-int/2addr v0, v1

    .line 10126
    :cond_1
    invoke-virtual {p0}, Ll/ܺۢۖ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 10127
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 10128
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 10130
    :cond_2
    invoke-virtual {p0}, Ll/ܺۢۖ;->hasType()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 10131
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 10132
    invoke-virtual {p0}, Ll/ܺۢۖ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 10134
    :cond_3
    invoke-virtual {p0}, Ll/ܺۢۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x5

    .line 10135
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 9993
    iget-boolean v1, p0, Ll/ܺۢۖ;->۬:Z

    .line 10136
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 10139
    :cond_4
    invoke-virtual {p0}, Ll/ܺۢۖ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x6

    .line 10140
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 10012
    iget-boolean v1, p0, Ll/ܺۢۖ;->ۗ:Z

    .line 10141
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    mul-int/lit8 v0, v0, 0x1d

    .line 10144
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 10145
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 9854
    invoke-static {}, Ll/ۧۖۖ;->ܶ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܺۢۖ;

    const-class v2, Ll/ۡۢۖ;

    .line 9855
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 10018
    iget-byte v0, p0, Ll/ܺۢۖ;->᩶:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 10022
    :cond_1
    iput-byte v1, p0, Ll/ܺۢۖ;->᩶:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 10224
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    invoke-virtual {v0}, Ll/ܺۢۖ;->toBuilder()Ll/ۡۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 10224
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    invoke-virtual {v0}, Ll/ܺۢۖ;->toBuilder()Ll/ۡۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 10238
    new-instance v0, Ll/ۡۢۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۡۢۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final toBuilder()Ll/ۡۢۖ;
    .locals 2

    .line 10231
    sget-object v0, Ll/ܺۢۖ;->ۤ:Ll/ܺۢۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 10232
    new-instance v0, Ll/ۡۢۖ;

    invoke-direct {v0, v1}, Ll/ۡۢۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۡۢۖ;

    invoke-direct {v0, v1}, Ll/ۡۢۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ۡۢۖ;->֫(Ll/ܺۢۖ;)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 9823
    invoke-virtual {p0}, Ll/ܺۢۖ;->toBuilder()Ll/ۡۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 9823
    invoke-virtual {p0}, Ll/ܺۢۖ;->toBuilder()Ll/ۡۢۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 10029
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 10030
    iget v0, p0, Ll/ܺۢۖ;->ۙ:I

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 10032
    :cond_0
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 10033
    iget-object v0, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 10035
    :cond_1
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 10036
    iget-object v1, p0, Ll/ܺۢۖ;->۫:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 10038
    :cond_2
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    const/4 v0, 0x5

    .line 10039
    iget-boolean v1, p0, Ll/ܺۢۖ;->۬:Z

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 10041
    :cond_3
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_4

    const/4 v0, 0x6

    .line 10042
    iget-boolean v1, p0, Ll/ܺۢۖ;->ۗ:Z

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 10044
    :cond_4
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ۖ()Z
    .locals 2

    .line 9868
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 10004
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 2

    .line 9896
    iget-object v0, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    .line 9897
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 9898
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 9900
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 9902
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 9903
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9904
    iput-object v1, p0, Ll/ܺۢۖ;->᩹:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final ۡ()Z
    .locals 1

    .line 9993
    iget-boolean v0, p0, Ll/ܺۢۖ;->۬:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 10012
    iget-boolean v0, p0, Ll/ܺۢۖ;->ۗ:Z

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 9888
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 9985
    iget v0, p0, Ll/ܺۢۖ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 9876
    iget v0, p0, Ll/ܺۢۖ;->ۙ:I

    return v0
.end method
