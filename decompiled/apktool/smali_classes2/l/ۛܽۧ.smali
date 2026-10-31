.class public final Ll/ۛܽۧ;
.super Ljava/lang/Object;
.source "Y8NU"


# static fields
.field public static final ᩳ:Ll/ۛܽۧ;


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/ܳ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 46
    new-instance v0, Ll/ۛܽۧ;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/۬᩵֫;

    invoke-direct {v0, v2}, Ll/ۛܽۧ;-><init>([Ll/۬᩵֫;)V

    sput-object v0, Ll/ۛܽۧ;->ᩳ:Ll/ۛܽۧ;

    .line 123
    invoke-static {v1}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public varargs constructor <init>([Ll/۬᩵֫;)V
    .locals 5

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫([Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    .line 63
    array-length p1, p1

    iput p1, p0, Ll/ۛܽۧ;->ۧ:I

    const/4 p1, 0x0

    .line 145
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    add-int/lit8 v1, p1, 0x1

    move v2, v1

    .line 146
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 147
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩵֫;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 148
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Multiple identical TrackGroups added to one TrackGroupArray."

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const-string v4, ""

    invoke-static {v4, v3}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
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

    .line 111
    const-class v2, Ll/ۛܽۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 114
    :cond_1
    check-cast p1, Ll/ۛܽۧ;

    .line 115
    iget v2, p0, Ll/ۛܽۧ;->ۧ:I

    iget v3, p1, Ll/ۛܽۧ;->ۧ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    iget-object p1, p1, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-virtual {v2, p1}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 100
    iget v0, p0, Ll/ۛܽۧ;->֫:I

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    iput v0, p0, Ll/ۛܽۧ;->֫:I

    .line 103
    :cond_0
    iget v0, p0, Ll/ۛܽۧ;->֫:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۬᩵֫;)I
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ۬ܺ;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)Ll/۬᩵֫;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬᩵֫;

    return-object p1
.end method

.method public final ֫()Ll/ܳ۬ܺ;
    .locals 2

    .line 95
    new-instance v0, Ll/ܺ۫᩷;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ll/ܺ۫᩷;-><init>(I)V

    iget-object v1, p0, Ll/ۛܽۧ;->ܽ:Ll/ܳ۬ܺ;

    invoke-static {v1, v0}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
