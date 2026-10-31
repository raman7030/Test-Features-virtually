.class public final Ll/ܰܶܺ;
.super Ljava/lang/Object;
.source "H38Z"

# interfaces
.implements Ll/ۛܶܺ;


# static fields
.field public static final ۙ:Ll/᩺ܶܺ;


# instance fields
.field public ᩶:Ljava/lang/Object;

.field public volatile ᩸:Ll/ۛܶܺ;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 180
    new-instance v0, Ll/᩺ܶܺ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰܶܺ;->ۙ:Ll/᩺ܶܺ;

    return-void
.end method

.method public constructor <init>(Ll/ۛܶܺ;)V
    .locals 1

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܰܶܺ;->᩹:Ljava/lang/Object;

    .line 190
    iput-object p1, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 198
    iget-object v0, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    sget-object v1, Ll/ܰܶܺ;->ۙ:Ll/᩺ܶܺ;

    if-eq v0, v1, :cond_1

    .line 199
    iget-object v0, p0, Ll/ܰܶܺ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 200
    :try_start_0
    iget-object v2, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    if-eq v2, v1, :cond_0

    .line 201
    iget-object v2, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    invoke-interface {v2}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v2

    .line 202
    iput-object v2, p0, Ll/ܰܶܺ;->᩶:Ljava/lang/Object;

    .line 203
    iput-object v1, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    .line 204
    monitor-exit v0

    return-object v2

    .line 206
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 209
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܰܶܺ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 214
    iget-object v0, p0, Ll/ܰܶܺ;->᩸:Ll/ۛܶܺ;

    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Suppliers.memoize("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    sget-object v2, Ll/ܰܶܺ;->ۙ:Ll/᩺ܶܺ;

    if-ne v0, v2, :cond_0

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "<supplier that returned "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܰܶܺ;->᩶:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 218
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
