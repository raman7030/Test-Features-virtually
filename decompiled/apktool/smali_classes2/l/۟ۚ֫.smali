.class public final synthetic Ll/۟ۚ֫;
.super Ljava/lang/Object;
.source "J8TX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֫֨֫;

.field public final synthetic ᩹:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ll/֫֨֫;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۚ֫;->᩸:Ll/֫֨֫;

    iput-object p2, p0, Ll/۟ۚ֫;->᩹:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/۟ۚ֫;->᩹:Landroid/content/Context;

    .line 257
    iget-object v1, p0, Ll/۟ۚ֫;->᩸:Ll/֫֨֫;

    iget-object v1, v1, Ll/֫֨֫;->֫:Ll/ۧ֨֫;

    invoke-static {v0, v1}, Ll/ۧ֨֫;->֫(Landroid/content/Context;Ll/ۧ֨֫;)V

    return-void
.end method
