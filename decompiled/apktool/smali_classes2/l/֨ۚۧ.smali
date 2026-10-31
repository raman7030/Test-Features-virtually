.class public final Ll/֨ۚۧ;
.super Ljava/lang/Object;
.source "18JT"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:[Ll/᩵ۢۧ;

.field public final ܽ:Ll/᩻۠֫;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/֨ۚۧ;->֫:Ljava/util/List;

    .line 43
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Ll/᩵ۢۧ;

    iput-object p1, p0, Ll/֨ۚۧ;->ۧ:[Ll/᩵ۢۧ;

    .line 44
    new-instance p1, Ll/᩻۠֫;

    new-instance v0, Ll/ۚۚۧ;

    invoke-direct {v0, p0}, Ll/ۚۚۧ;-><init>(Ll/֨ۚۧ;)V

    invoke-direct {p1, v0}, Ll/᩻۠֫;-><init>(Ll/ܳ۠֫;)V

    iput-object p1, p0, Ll/֨ۚۧ;->ܽ:Ll/᩻۠֫;

    const/4 v0, 0x3

    .line 50
    invoke-virtual {p1, v0}, Ll/᩻۠֫;->֫(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/֨ۚۧ;JLl/ᩳ֨֫;)V
    .locals 0

    .line 47
    iget-object p0, p0, Ll/֨ۚۧ;->ۧ:[Ll/᩵ۢۧ;

    invoke-static {p1, p2, p3, p0}, Ll/ۜ᩷ۧ;->ۧ(JLl/ᩳ֨֫;[Ll/᩵ۢۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫(JLl/ᩳ֨֫;)V
    .locals 4

    .line 79
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {p3}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 83
    invoke-virtual {p3}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 84
    invoke-virtual {p3}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    .line 88
    iget-object v0, p0, Ll/֨ۚۧ;->ܽ:Ll/᩻۠֫;

    invoke-virtual {v0, p1, p2, p3}, Ll/᩻۠֫;->֫(JLl/ᩳ֨֫;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 8

    const/4 v0, 0x0

    .line 55
    :goto_0
    iget-object v1, p0, Ll/֨ۚۧ;->ۧ:[Ll/᩵ۢۧ;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 56
    invoke-virtual {p2}, Ll/᩵ۚۧ;->֫()V

    .line 57
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ܽ()I

    move-result v2

    const/4 v3, 0x3

    invoke-interface {p1, v2, v3}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v2

    .line 58
    iget-object v3, p0, Ll/֨ۚۧ;->֫:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠ᩴ֫;

    .line 59
    iget-object v4, v3, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v5, "application/cea-608"

    .line 61
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "application/cea-708"

    .line 62
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v5, 0x1

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Invalid closed caption MIME type provided: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 60
    invoke-static {v6, v5}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 64
    new-instance v5, Ll/֨ᩴ֫;

    invoke-direct {v5}, Ll/֨ᩴ֫;-><init>()V

    .line 66
    invoke-virtual {p2}, Ll/᩵ۚۧ;->ۧ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    const-string v6, "video/mp2t"

    .line 67
    invoke-virtual {v5, v6}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    .line 68
    invoke-virtual {v5, v4}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget v4, v3, Ll/۠ᩴ֫;->ᩳ֫:I

    .line 69
    invoke-virtual {v5, v4}, Ll/֨ᩴ֫;->ܶ(I)V

    iget-object v4, v3, Ll/۠ᩴ֫;->ۙ:Ljava/lang/String;

    .line 70
    invoke-virtual {v5, v4}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v4, v3, Ll/۠ᩴ֫;->֫:I

    .line 71
    invoke-virtual {v5, v4}, Ll/֨ᩴ֫;->֫(I)V

    iget-object v3, v3, Ll/۠ᩴ֫;->᩸:Ljava/util/List;

    .line 72
    invoke-virtual {v5, v3}, Ll/֨ᩴ֫;->֫(Ljava/util/List;)V

    .line 73
    invoke-virtual {v5}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    .line 64
    invoke-interface {v2, v3}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 74
    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
