.class public final Ll/ۗܰ᩵;
.super Ll/ۖ۟᩵;
.source "C30H"


# static fields
.field public static final ܽ:Ll/ܰܰ᩵;


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "application/x-www-form-urlencoded"

    .line 31
    invoke-static {v0}, Ll/ܰܰ᩵;->֫(Ljava/lang/String;)Ll/ܰܰ᩵;

    move-result-object v0

    sput-object v0, Ll/ۗܰ᩵;->ܽ:Ll/ܰܰ᩵;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {p1}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗܰ᩵;->֫:Ljava/util/List;

    .line 38
    invoke-static {p2}, Ll/᩶۟᩵;->֫(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗܰ᩵;->ۧ:Ljava/util/List;

    return-void
.end method

.method private ֫(Ll/ۤܽ֡;Z)J
    .locals 6

    if-eqz p2, :cond_0

    .line 85
    new-instance p1, Ll/۫ܽ֡;

    invoke-direct {p1}, Ll/۫ܽ֡;-><init>()V

    goto :goto_0

    .line 87
    :cond_0
    invoke-interface {p1}, Ll/ۤܽ֡;->᩷()Ll/۫ܽ֡;

    move-result-object p1

    .line 90
    :goto_0
    iget-object v0, p0, Ll/ۗܰ᩵;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_2

    if-lez v3, :cond_1

    const/16 v4, 0x26

    .line 91
    invoke-virtual {p1, v4}, Ll/۫ܽ֡;->writeByte(I)V

    .line 92
    :cond_1
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {p1, v2, v5, v4}, Ll/۫ܽ֡;->֫(IILjava/lang/String;)V

    const/16 v4, 0x3d

    .line 93
    invoke-virtual {p1, v4}, Ll/۫ܽ֡;->writeByte(I)V

    .line 94
    iget-object v4, p0, Ll/ۗܰ᩵;->ۧ:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 953
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {p1, v2, v5, v4}, Ll/۫ܽ֡;->֫(IILjava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    .line 98
    invoke-virtual {p1}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    .line 99
    invoke-virtual {p1}, Ll/۫ܽ֡;->֫()V

    return-wide v0

    :cond_3
    const-wide/16 p1, 0x0

    return-wide p1
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 67
    invoke-direct {p0, v0, v1}, Ll/ۗܰ᩵;->֫(Ll/ۤܽ֡;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Ll/ۤܽ֡;)V
    .locals 1

    const/4 v0, 0x0

    .line 71
    invoke-direct {p0, p1, v0}, Ll/ۗܰ᩵;->֫(Ll/ۤܽ֡;Z)J

    return-void
.end method

.method public final ܽ()Ll/ܰܰ᩵;
    .locals 1

    .line 63
    sget-object v0, Ll/ۗܰ᩵;->ܽ:Ll/ܰܰ᩵;

    return-object v0
.end method
