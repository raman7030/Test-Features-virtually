.class public final Ll/ۨܶܺ;
.super Ljava/lang/Object;
.source "H38Z"

# interfaces
.implements Ll/ۛܶܺ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۙ:Ljava/lang/Object;

.field public transient ᩶:Ljava/lang/Object;

.field public final ᩸:Ll/ۛܶܺ;

.field public volatile transient ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۛܶܺ;)V
    .locals 1

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۨܶܺ;->᩶:Ljava/lang/Object;

    .line 135
    iput-object p1, p0, Ll/ۨܶܺ;->᩸:Ll/ۛܶܺ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 168
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 169
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨܶܺ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 144
    iget-boolean v0, p0, Ll/ۨܶܺ;->᩹:Z

    if-nez v0, :cond_1

    .line 145
    iget-object v0, p0, Ll/ۨܶܺ;->᩶:Ljava/lang/Object;

    monitor-enter v0

    .line 146
    :try_start_0
    iget-boolean v1, p0, Ll/ۨܶܺ;->᩹:Z

    if-nez v1, :cond_0

    .line 147
    iget-object v1, p0, Ll/ۨܶܺ;->᩸:Ll/ۛܶܺ;

    invoke-interface {v1}, Ll/ۛܶܺ;->get()Ljava/lang/Object;

    move-result-object v1

    .line 148
    iput-object v1, p0, Ll/ۨܶܺ;->ۙ:Ljava/lang/Object;

    const/4 v2, 0x1

    .line 149
    iput-boolean v2, p0, Ll/ۨܶܺ;->᩹:Z

    .line 150
    monitor-exit v0

    return-object v1

    .line 152
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 155
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۨܶܺ;->ۙ:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Suppliers.memoize("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    iget-boolean v1, p0, Ll/ۨܶܺ;->᩹:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<supplier that returned "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۨܶܺ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ۨܶܺ;->᩸:Ll/ۛܶܺ;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
