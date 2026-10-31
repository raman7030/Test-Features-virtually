.class public final synthetic Ll/۫֡ۢ;
.super Ljava/lang/Object;
.source "97BO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/ܶ᩵ܿ;

.field public final synthetic ᩸:Z

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/۫֡ۢ;->᩸:Z

    iput-object p2, p0, Ll/۫֡ۢ;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/۫֡ۢ;->᩶:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 413
    iget-boolean v0, p0, Ll/۫֡ۢ;->᩸:Z

    invoke-static {v0}, Ll/ܽۤܳ;->֫(Z)Ll/ܽۤܳ;

    move-result-object v0

    iget-object v1, p0, Ll/۫֡ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ܽۤܳ;->֫(Ljava/lang/String;)V

    .line 414
    iget-object v0, p0, Ll/۫֡ۢ;->᩶:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ܳۤܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 415
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 416
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    return-void
.end method
