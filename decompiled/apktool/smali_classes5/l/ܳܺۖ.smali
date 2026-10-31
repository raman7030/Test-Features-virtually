.class public final Ll/ܳܺۖ;
.super Ll/ۘᩴۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۛ:Ll/ܳܺۖ;

.field public static final ۨ:Ll/۫֡ۖ;


# instance fields
.field public volatile ۗ:Ljava/lang/Object;

.field public ۙ:B

.field public ۤ:Z

.field public volatile ۫:Ljava/lang/Object;

.field public ۬:Ll/ۡܺۖ;

.field public volatile ᩶:Ljava/lang/Object;

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 19623
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܳܺۖ;

    .line 19629
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 19623
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 20789
    new-instance v0, Ll/ܳܺۖ;

    invoke-direct {v0}, Ll/ܳܺۖ;-><init>()V

    sput-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    .line 20797
    new-instance v0, Ll/ᩳܺۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ܳܺۖ;->ۨ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 19635
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const-string v0, ""

    .line 19656
    iput-object v0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    .line 19705
    iput-object v0, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    .line 19754
    iput-object v0, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 19829
    iput-boolean v1, p0, Ll/ܳܺۖ;->᩹:Z

    .line 19848
    iput-boolean v1, p0, Ll/ܳܺۖ;->ۤ:Z

    const/4 v1, -0x1

    .line 19866
    iput-byte v1, p0, Ll/ܳܺۖ;->ۙ:B

    .line 19636
    iput-object v0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    .line 19637
    iput-object v0, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    .line 19638
    iput-object v0, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ܿܺۖ;I)V
    .locals 0

    .line 19633
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const-string p1, ""

    .line 19656
    iput-object p1, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    .line 19705
    iput-object p1, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    .line 19754
    iput-object p1, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 19829
    iput-boolean p1, p0, Ll/ܳܺۖ;->᩹:Z

    .line 19848
    iput-boolean p1, p0, Ll/ܳܺۖ;->ۤ:Z

    const/4 p1, -0x1

    .line 19866
    iput-byte p1, p0, Ll/ܳܺۖ;->ۙ:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܳܺۖ;
    .locals 1

    .line 20793
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ܿܺۖ;
    .locals 1

    .line 20096
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    invoke-virtual {v0}, Ll/ܳܺۖ;->toBuilder()Ll/ܿܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public static parser()Ll/۫֡ۖ;
    .locals 1

    .line 20819
    sget-object v0, Ll/ܳܺۖ;->ۨ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public static synthetic ֫(Ll/ܳܺۖ;)Ljava/lang/Object;
    .locals 0

    .line 19617
    iget-object p0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܳܺۖ;I)V
    .locals 1

    .line 19617
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ܳܺۖ;->᩸:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺۖ;Ljava/lang/Object;)V
    .locals 0

    .line 19617
    iput-object p1, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺۖ;Ll/ۡܺۖ;)V
    .locals 0

    .line 19617
    iput-object p1, p0, Ll/ܳܺۖ;->۬:Ll/ۡܺۖ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܳܺۖ;Z)V
    .locals 0

    .line 19617
    iput-boolean p1, p0, Ll/ܳܺۖ;->᩹:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳܺۖ;)Ljava/lang/Object;
    .locals 0

    .line 19617
    iget-object p0, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܳܺۖ;Ljava/lang/Object;)V
    .locals 0

    .line 19617
    iput-object p1, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳܺۖ;Z)V
    .locals 0

    .line 19617
    iput-boolean p1, p0, Ll/ܳܺۖ;->ۤ:Z

    return-void
.end method

.method public static synthetic ܽ(Ll/ܳܺۖ;)Ljava/lang/Object;
    .locals 0

    .line 19617
    iget-object p0, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܳܺۖ;Ljava/lang/Object;)V
    .locals 0

    .line 19617
    iput-object p1, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto/16 :goto_1

    .line 19944
    :cond_0
    instance-of v0, p1, Ll/ܳܺۖ;

    if-nez v0, :cond_1

    .line 19945
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 19947
    :cond_1
    check-cast p1, Ll/ܳܺۖ;

    .line 19949
    invoke-virtual {p0}, Ll/ܳܺۖ;->hasName()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->hasName()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto/16 :goto_0

    .line 19950
    :cond_2
    invoke-virtual {p0}, Ll/ܳܺۖ;->hasName()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19951
    invoke-virtual {p0}, Ll/ܳܺۖ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 19952
    invoke-virtual {p1}, Ll/ܳܺۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    .line 19954
    :cond_3
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۘ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->ۘ()Z

    move-result v1

    if-eq v0, v1, :cond_4

    goto/16 :goto_0

    .line 19955
    :cond_4
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19956
    invoke-virtual {p0}, Ll/ܳܺۖ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 19957
    invoke-virtual {p1}, Ll/ܳܺۖ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 19959
    :cond_5
    invoke-virtual {p0}, Ll/ܳܺۖ;->᩵()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->᩵()Z

    move-result v1

    if-eq v0, v1, :cond_6

    goto/16 :goto_0

    .line 19960
    :cond_6
    invoke-virtual {p0}, Ll/ܳܺۖ;->᩵()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 19961
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۡ()Ljava/lang/String;

    move-result-object v0

    .line 19962
    invoke-virtual {p1}, Ll/ܳܺۖ;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 19964
    :cond_7
    invoke-virtual {p0}, Ll/ܳܺۖ;->ᩴ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->ᩴ()Z

    move-result v1

    if-eq v0, v1, :cond_8

    goto :goto_0

    .line 19965
    :cond_8
    invoke-virtual {p0}, Ll/ܳܺۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 19966
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v0

    .line 19967
    invoke-virtual {p1}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۡܺۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    .line 19969
    :cond_9
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۖ()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->ۖ()Z

    move-result v1

    if-eq v0, v1, :cond_a

    goto :goto_0

    .line 19970
    :cond_a
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۖ()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 19844
    iget-boolean v0, p0, Ll/ܳܺۖ;->᩹:Z

    iget-boolean v1, p1, Ll/ܳܺۖ;->᩹:Z

    if-eq v0, v1, :cond_b

    goto :goto_0

    .line 19974
    :cond_b
    invoke-virtual {p0}, Ll/ܳܺۖ;->֡()Z

    move-result v0

    invoke-virtual {p1}, Ll/ܳܺۖ;->֡()Z

    move-result v1

    if-eq v0, v1, :cond_c

    goto :goto_0

    .line 19975
    :cond_c
    invoke-virtual {p0}, Ll/ܳܺۖ;->֡()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 19863
    iget-boolean v0, p0, Ll/ܳܺۖ;->ۤ:Z

    iget-boolean v1, p1, Ll/ܳܺۖ;->ۤ:Z

    if-eq v0, v1, :cond_d

    goto :goto_0

    .line 19979
    :cond_d
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_e
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 20829
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 20829
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 2

    .line 19672
    iget-object v0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    .line 19673
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 19674
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 19676
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 19678
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 19679
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19680
    iput-object v1, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 20824
    sget-object v0, Ll/ܳܺۖ;->ۨ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 19909
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 19913
    :cond_0
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 19914
    iget-object v0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    invoke-static {v1, v0}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 19916
    :goto_0
    iget v1, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 19917
    iget-object v1, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    invoke-static {v2, v1}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 19919
    :cond_2
    iget v1, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 19920
    iget-object v3, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    invoke-static {v1, v3}, Ll/ۘᩴۖ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    .line 19922
    :cond_3
    iget v1, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    .line 19924
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 19926
    :cond_4
    iget v1, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 19928
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 19930
    :cond_5
    iget v1, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v1, v1, 0x20

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 19932
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 19934
    :cond_6
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 19935
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hasName()Z
    .locals 2

    .line 19664
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 19985
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 19643
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->᩷()Ll/ᩳۖۖ;

    move-result-object v0

    .line 19989
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 19990
    invoke-virtual {p0}, Ll/ܳܺۖ;->hasName()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 19991
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 19992
    invoke-virtual {p0}, Ll/ܳܺۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 19994
    :cond_1
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۘ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 19995
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 19996
    invoke-virtual {p0}, Ll/ܳܺۖ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 19998
    :cond_2
    invoke-virtual {p0}, Ll/ܳܺۖ;->᩵()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x3

    .line 19999
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 20000
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 20002
    :cond_3
    invoke-virtual {p0}, Ll/ܳܺۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x4

    .line 20003
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 20004
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۡܺۖ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 20006
    :cond_4
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    .line 20007
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 19844
    iget-boolean v1, p0, Ll/ܳܺۖ;->᩹:Z

    .line 20008
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 20011
    :cond_5
    invoke-virtual {p0}, Ll/ܳܺۖ;->֡()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x6

    .line 20012
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 19863
    iget-boolean v1, p0, Ll/ܳܺۖ;->ۤ:Z

    .line 20013
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    mul-int/lit8 v0, v0, 0x1d

    .line 20016
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 20017
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 19649
    invoke-static {}, Ll/ۧۖۖ;->ۢ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܳܺۖ;

    const-class v2, Ll/ܿܺۖ;

    .line 19650
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 3

    .line 19869
    iget-byte v0, p0, Ll/ܳܺۖ;->ۙ:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 19873
    :cond_1
    invoke-virtual {p0}, Ll/ܳܺۖ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19874
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܺۖ;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_2

    .line 19875
    iput-byte v2, p0, Ll/ܳܺۖ;->ۙ:B

    return v2

    .line 19879
    :cond_2
    iput-byte v1, p0, Ll/ܳܺۖ;->ۙ:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 20096
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    invoke-virtual {v0}, Ll/ܳܺۖ;->toBuilder()Ll/ܿܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 20096
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    invoke-virtual {v0}, Ll/ܳܺۖ;->toBuilder()Ll/ܿܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 20110
    new-instance v0, Ll/ܿܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܿܺۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 19617
    invoke-virtual {p0}, Ll/ܳܺۖ;->toBuilder()Ll/ܿܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 19617
    invoke-virtual {p0}, Ll/ܳܺۖ;->toBuilder()Ll/ܿܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ܿܺۖ;
    .locals 2

    .line 20103
    sget-object v0, Ll/ܳܺۖ;->ۛ:Ll/ܳܺۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 20104
    new-instance v0, Ll/ܿܺۖ;

    invoke-direct {v0, v1}, Ll/ܿܺۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܿܺۖ;

    invoke-direct {v0, v1}, Ll/ܿܺۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܿܺۖ;->֫(Ll/ܳܺۖ;)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    .line 19886
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 19887
    iget-object v0, p0, Ll/ܳܺۖ;->ۗ:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 19889
    :cond_0
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 19890
    iget-object v0, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 19892
    :cond_1
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    .line 19893
    iget-object v2, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V

    .line 19895
    :cond_2
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 19896
    invoke-virtual {p0}, Ll/ܳܺۖ;->ۢ()Ll/ۡܺۖ;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    .line 19898
    :cond_3
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_4

    const/4 v0, 0x5

    .line 19899
    iget-boolean v1, p0, Ll/ܳܺۖ;->᩹:Z

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 19901
    :cond_4
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_5

    const/4 v0, 0x6

    .line 19902
    iget-boolean v1, p0, Ll/ܳܺۖ;->ۤ:Z

    invoke-virtual {p1, v0, v1}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 19904
    :cond_5
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ֡()Z
    .locals 1

    .line 19855
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۖ()Z
    .locals 1

    .line 19836
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 19713
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 19844
    iget-boolean v0, p0, Ll/ܳܺۖ;->᩹:Z

    return v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 2

    .line 19770
    iget-object v0, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    .line 19771
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 19772
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 19774
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 19776
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 19777
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19778
    iput-object v1, p0, Ll/ܳܺۖ;->۫:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method

.method public final ۢ()Ll/ۡܺۖ;
    .locals 1

    .line 19818
    iget-object v0, p0, Ll/ܳܺۖ;->۬:Ll/ۡܺۖ;

    if-nez v0, :cond_0

    invoke-static {}, Ll/ۡܺۖ;->getDefaultInstance()Ll/ۡܺۖ;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 19863
    iget-boolean v0, p0, Ll/ܳܺۖ;->ۤ:Z

    return v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 19810
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 19762
    iget v0, p0, Ll/ܳܺۖ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 2

    .line 19721
    iget-object v0, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    .line 19722
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 19723
    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 19725
    :cond_0
    check-cast v0, Ll/ۛۜۖ;

    .line 19727
    invoke-virtual {v0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object v1

    .line 19728
    invoke-virtual {v0}, Ll/ۛۜۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19729
    iput-object v1, p0, Ll/ܳܺۖ;->᩶:Ljava/lang/Object;

    :cond_1
    return-object v1
.end method
