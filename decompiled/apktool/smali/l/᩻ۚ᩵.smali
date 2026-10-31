.class public abstract Ll/᩻ۚ᩵;
.super Ljava/lang/Object;
.source "89TZ"

# interfaces
.implements Ll/ۚۡ᩵;


# static fields
.field public static final ۙ:Ll/֫᩻֨;


# instance fields
.field public final ᩶:Ll/۬ۚ᩵;

.field public final ᩸:Ll/ۚۡ᩵;

.field public ᩹:Ll/ۤۡ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Ll/᩻ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩻ۚ᩵;->ۙ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;Ll/ۚۡ᩵;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/᩻ۚ᩵;->᩶:Ll/۬ۚ᩵;

    .line 49
    iput-object p2, p0, Ll/᩻ۚ᩵;->᩸:Ll/ۚۡ᩵;

    .line 51
    invoke-direct {p0}, Ll/᩻ۚ᩵;->ܽ()Ll/ۤۡ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۚ᩵;->᩹:Ll/ۤۡ᩵;

    return-void
.end method

.method private ܽ()Ll/ۤۡ᩵;
    .locals 3

    .line 67
    :goto_0
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩸:Ll/ۚۡ᩵;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳۚ᩵;

    .line 71
    :try_start_0
    invoke-virtual {p0, v0}, Ll/᩻ۚ᩵;->֫(Ll/ܳۚ᩵;)Ll/۬ۚ᩵;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 73
    sget-object v1, Ll/᩻ۚ᩵;->ۙ:Ll/֫᩻֨;

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

    .line 129
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩸:Ll/ۚۡ᩵;

    invoke-interface {v0}, Ll/ۚۡ᩵;->close()V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 104
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩹:Ll/ۤۡ᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 115
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩹:Ll/ۤۡ᩵;

    .line 116
    invoke-direct {p0}, Ll/᩻ۚ᩵;->ܽ()Ll/ۤۡ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/᩻ۚ᩵;->᩹:Ll/ۤۡ᩵;

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 134
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩸:Ll/ۚۡ᩵;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method

.method public final ֫()Ll/ۤۡ᩵;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/᩻ۚ᩵;->᩶:Ll/۬ۚ᩵;

    return-object v0
.end method

.method public abstract ֫(Ll/ܳۚ᩵;)Ll/۬ۚ᩵;
.end method
