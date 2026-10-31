.class public final Ll/ۖۢ֨;
.super Ljava/lang/Object;
.source "D5IX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘۢ֨;

.field public final synthetic ᩹:Ll/ᩴۢ֨;


# direct methods
.method public constructor <init>(Ll/ۘۢ֨;Ll/ᩴۢ֨;)V
    .locals 0

    .line 197
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۢ֨;->᩸:Ll/ۘۢ֨;

    iput-object p2, p0, Ll/ۖۢ֨;->᩹:Ll/ᩴۢ֨;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 200
    iget-object v0, p0, Ll/ۖۢ֨;->᩸:Ll/ۘۢ֨;

    invoke-static {v0}, Ll/ۘۢ֨;->֫(Ll/ۘۢ֨;)Lpl/droidsonroids/gif/GifInfoHandle;

    move-result-object v0

    iget-object v1, p0, Ll/ۖۢ֨;->᩹:Ll/ᩴۢ֨;

    invoke-static {v1, v0}, Ll/ᩴۢ֨;->֫(Ll/ᩴۢ֨;Lpl/droidsonroids/gif/GifInfoHandle;)V

    return-void
.end method
