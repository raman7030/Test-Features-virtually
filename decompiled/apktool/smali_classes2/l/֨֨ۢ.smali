.class public final synthetic Ll/֨֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܳ֨ۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ܳ֨ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨֨ۢ;->᩸:Ll/ܳ֨ۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֨֨ۢ;->᩸:Ll/ܳ֨ۢ;

    .line 233
    :try_start_0
    invoke-static {v0}, Ll/᩶֨ۢ;->֫(Ll/ܳ֨ۢ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Shizuku prewarm error"

    .line 235
    invoke-static {v1, v0}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
