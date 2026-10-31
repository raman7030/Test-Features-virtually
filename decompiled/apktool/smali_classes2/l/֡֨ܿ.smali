.class public final Ll/֡֨ܿ;
.super Ljava/lang/Exception;
.source "JAQI"


# instance fields
.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 13
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    iput-object p2, p0, Ll/֡֨ܿ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 48
    monitor-exit v0

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֡֨ܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/֡֨ܿ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Ll/֡֨ܿ;->᩸:Z

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Ll/֡֨ܿ;->᩶:Z

    return v0
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Ll/֡֨ܿ;->᩶:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Ll/֡֨ܿ;->᩸:Z

    return-void
.end method
