.class public Ll/۬ۡ֫;
.super Ljava/lang/Object;
.source "J5SJ"

# interfaces
.implements Ll/ܿۡ֫;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ᩸:Ll/᩵ۢ֫;

.field public final ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/۬ۡ֫;->᩹:Ljava/lang/Object;

    .line 35
    sget-object v0, Ll/ۚۢ֫;->ܽ:Ll/ۚۢ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۚۢ֫;->֫(Ljava/lang/Class;)Ll/᩵ۢ֫;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡ֫;->᩸:Ll/᩵ۢ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 2

    .line 40
    iget-object v0, p0, Ll/۬ۡ֫;->᩸:Ll/᩵ۢ֫;

    iget-object v1, p0, Ll/۬ۡ֫;->᩹:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2, v1}, Ll/᩵ۢ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;Ljava/lang/Object;)V

    return-void
.end method
