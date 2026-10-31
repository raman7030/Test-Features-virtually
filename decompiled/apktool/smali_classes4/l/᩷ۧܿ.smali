.class public final synthetic Ll/᩷ۧܿ;
.super Ljava/lang/Object;
.source "44TS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/RuntimeException;

.field public final synthetic ᩸:Ll/֨ۧܿ;

.field public final synthetic ᩹:Ll/ۚۧܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֨ۧܿ;Ll/ۚۧܿ;Ljava/lang/RuntimeException;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۧܿ;->᩸:Ll/֨ۧܿ;

    iput-object p2, p0, Ll/᩷ۧܿ;->᩹:Ll/ۚۧܿ;

    iput-object p3, p0, Ll/᩷ۧܿ;->᩶:Ljava/lang/RuntimeException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/᩷ۧܿ;->᩹:Ll/ۚۧܿ;

    iget-object v1, p0, Ll/᩷ۧܿ;->᩶:Ljava/lang/RuntimeException;

    iget-object v2, p0, Ll/᩷ۧܿ;->᩸:Ll/֨ۧܿ;

    invoke-static {v2, v0, v1}, Ll/֨ۧܿ;->֫(Ll/֨ۧܿ;Ll/ۚۧܿ;Ljava/lang/RuntimeException;)V

    return-void
.end method
