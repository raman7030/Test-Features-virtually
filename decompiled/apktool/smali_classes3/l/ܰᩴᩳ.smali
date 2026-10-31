.class public final synthetic Ll/ܰᩴᩳ;
.super Ljava/lang/Object;
.source "A6S3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ᩴᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ᩴᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰᩴᩳ;->᩸:Ll/۟ᩴᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܰᩴᩳ;->᩸:Ll/۟ᩴᩳ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    :try_start_0
    invoke-virtual {v0}, Ll/۟ᩴᩳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
