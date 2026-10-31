.class public Ll/ۚܿ֡;
.super Ljava/lang/RuntimeException;
.source "W66M"


# instance fields
.field public ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۚܿ֡;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۚܿ֡;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
