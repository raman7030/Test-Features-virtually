.class public final synthetic Ll/ۜۧܿ;
.super Ljava/lang/Object;
.source "44TS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ll/᩵ۧܿ;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/֨ۧܿ;

.field public final synthetic ᩹:Ll/ۚۧܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֨ۧܿ;Ll/ۚۧܿ;ZLl/᩵ۧܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۧܿ;->᩸:Ll/֨ۧܿ;

    iput-object p2, p0, Ll/ۜۧܿ;->᩹:Ll/ۚۧܿ;

    iput-boolean p3, p0, Ll/ۜۧܿ;->᩶:Z

    iput-object p4, p0, Ll/ۜۧܿ;->ۙ:Ll/᩵ۧܿ;

    iput-boolean p5, p0, Ll/ۜۧܿ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Ll/ۜۧܿ;->ۙ:Ll/᩵ۧܿ;

    iget-boolean v1, p0, Ll/ۜۧܿ;->ۗ:Z

    iget-object v2, p0, Ll/ۜۧܿ;->᩸:Ll/֨ۧܿ;

    iget-object v3, p0, Ll/ۜۧܿ;->᩹:Ll/ۚۧܿ;

    iget-boolean v4, p0, Ll/ۜۧܿ;->᩶:Z

    invoke-static {v2, v3, v4, v0, v1}, Ll/֨ۧܿ;->֫(Ll/֨ۧܿ;Ll/ۚۧܿ;ZLl/᩵ۧܿ;Z)V

    return-void
.end method
