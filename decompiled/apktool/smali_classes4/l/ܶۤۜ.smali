.class public final Ll/ܶۤۜ;
.super Ll/۬ᩴܺ;
.source "D8GL"


# instance fields
.field public final ֫:Ll/᩷ۤۜ;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ll/ۧ᩵֫;

.field public final ܿ:Z

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۧ᩵֫;Ljava/util/List;ZLl/᩷ۤۜ;Ljava/lang/String;)V
    .locals 1

    .line 2799
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2800
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    .line 2799
    iput-object p1, p0, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    iput-object p2, p0, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    iput-boolean p3, p0, Ll/ܶۤۜ;->ܿ:Z

    iput-object p4, p0, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    iput-object p5, p0, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۧ᩵֫;Ljava/util/List;ZLl/᩷ۤۜ;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p5}, Ll/ܶۤۜ;-><init>(Ll/ۧ᩵֫;Ljava/util/List;ZLl/᩷ۤۜ;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ۧ᩵֫;Ljava/util/List;Z)Ll/ܶۤۜ;
    .locals 7

    .line 2807
    new-instance v6, Ll/ܶۤۜ;

    sget-object v4, Ll/᩷ۤۜ;->ۙ:Ll/᩷ۤۜ;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Ll/ܶۤۜ;-><init>(Ll/ۧ᩵֫;Ljava/util/List;ZLl/᩷ۤۜ;Ljava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 2794
    instance-of v0, p1, Ll/ܶۤۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܶۤۜ;

    iget-boolean v0, p0, Ll/ܶۤۜ;->ܿ:Z

    iget-boolean v1, p1, Ll/ܶۤۜ;->ܿ:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    iget-object v1, p1, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    iget-object v1, p1, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    iget-object v1, p1, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 0
    iget-boolean v0, p0, Ll/ܶۤۜ;->ܿ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 2794
    iget-object v1, p0, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 2794
    iget-boolean v0, p0, Ll/ܶۤۜ;->ܿ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    aput-object v0, v1, v4

    const/4 v0, 0x3

    iget-object v4, p0, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    aput-object v4, v1, v0

    const/4 v0, 0x4

    iget-object v4, p0, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    aput-object v4, v1, v0

    const-string v0, "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ܶۤۜ;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 2794
    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩷ۤۜ;
    .locals 1

    .line 2794
    iget-object v0, p0, Ll/ܶۤۜ;->֫:Ll/᩷ۤۜ;

    return-object v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 2794
    iget-object v0, p0, Ll/ܶۤۜ;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 2794
    iget-object v0, p0, Ll/ܶۤۜ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ll/ۧ᩵֫;
    .locals 1

    .line 2794
    iget-object v0, p0, Ll/ܶۤۜ;->ܽ:Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 2794
    iget-boolean v0, p0, Ll/ܶۤۜ;->ܿ:Z

    return v0
.end method
