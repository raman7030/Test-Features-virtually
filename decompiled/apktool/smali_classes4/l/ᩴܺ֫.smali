.class public final Ll/ᩴܺ֫;
.super Ljava/lang/Object;
.source "S1KE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Z

.field public final ᩸:Ll/᩺ۢ֫;

.field public final ᩹:Ll/᩷ۡ֫;


# direct methods
.method public constructor <init>(Ll/᩷ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    const-string v0, "registry"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Ll/ᩴܺ֫;->᩹:Ll/᩷ۡ֫;

    .line 86
    iput-object p2, p0, Ll/ᩴܺ֫;->᩸:Ll/᩺ۢ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 91
    iget-boolean v0, p0, Ll/ᩴܺ֫;->᩶:Z

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Ll/ᩴܺ֫;->᩹:Ll/᩷ۡ֫;

    iget-object v1, p0, Ll/ᩴܺ֫;->᩸:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Ll/ᩴܺ֫;->᩶:Z

    :cond_0
    return-void
.end method
