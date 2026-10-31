.class public final Ll/ܶ᩻ۧ;
.super Landroid/opengl/GLSurfaceView;
.source "38NX"

# interfaces
.implements Ll/᩸᩻ۧ;


# static fields
.field public static final synthetic ᩹:I


# instance fields
.field public final ᩸:Ll/۠᩻ۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-direct {p0, p1, v0}, Ll/ܶ᩻ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 70
    new-instance p1, Ll/۠᩻ۧ;

    invoke-direct {p1, p0}, Ll/۠᩻ۧ;-><init>(Ll/ܶ᩻ۧ;)V

    iput-object p1, p0, Ll/ܶ᩻ۧ;->᩸:Ll/۠᩻ۧ;

    const/4 p2, 0x1

    .line 71
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setPreserveEGLContextOnPause(Z)V

    const/4 p2, 0x2

    .line 72
    invoke-virtual {p0, p2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 73
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1}, Landroid/opengl/GLSurfaceView;->setRenderMode(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬᩸֫;)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ܶ᩻ۧ;->᩸:Ll/۠᩻ۧ;

    invoke-virtual {v0, p1}, Ll/۠᩻ۧ;->֫(Ll/۬᩸֫;)V

    return-void
.end method
