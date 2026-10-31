.class public final Ll/᩸ۚ᩵;
.super Ljava/lang/Object;
.source "X9YC"

# interfaces
.implements Ll/ۚۡ᩵;


# static fields
.field public static final ۙ:Ll/֫᩻֨;


# instance fields
.field public final ᩶:Ll/۬ۚ᩵;

.field public final ᩸:Ljava/util/Iterator;

.field public ᩹:Ll/۬ۚ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Ll/᩸ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩸ۚ᩵;->ۙ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;Ljava/util/Iterator;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩸ۚ᩵;->᩶:Ll/۬ۚ᩵;

    .line 51
    iput-object p2, p0, Ll/᩸ۚ᩵;->᩸:Ljava/util/Iterator;

    .line 53
    invoke-direct {p0}, Ll/᩸ۚ᩵;->֫()Ll/۬ۚ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۚ᩵;->᩹:Ll/۬ۚ᩵;

    return-void
.end method

.method private ֫()Ll/۬ۚ᩵;
    .locals 12

    .line 61
    :goto_0
    iget-object v0, p0, Ll/᩸ۚ᩵;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۚ᩵;

    .line 89
    :try_start_0
    new-instance v11, Ll/۬ۚ᩵;

    iget-object v2, p0, Ll/᩸ۚ᩵;->᩶:Ll/۬ۚ᩵;

    invoke-interface {v0}, Ll/ܳۚ᩵;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Ll/ܳۚ᩵;->getType()I

    move-result v5

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v4, 0x0

    const/16 v6, 0x11

    move-object v1, v11

    invoke-direct/range {v1 .. v10}, Ll/۬ۚ᩵;-><init>(Ll/ۤۡ᩵;Ljava/lang/String;ZIIJJ)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v11

    :catch_0
    move-exception v0

    .line 67
    sget-object v1, Ll/᩸ۚ᩵;->ۙ:Ll/֫᩻֨;

    const-string v2, "Failed to create child URL"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 125
    iput-object v0, p0, Ll/᩸ۚ᩵;->᩹:Ll/۬ۚ᩵;

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 100
    iget-object v0, p0, Ll/᩸ۚ᩵;->᩹:Ll/۬ۚ᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/᩸ۚ᩵;->᩹:Ll/۬ۚ᩵;

    .line 112
    invoke-direct {p0}, Ll/᩸ۚ᩵;->֫()Ll/۬ۚ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/᩸ۚ᩵;->᩹:Ll/۬ۚ᩵;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 130
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "remove"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
