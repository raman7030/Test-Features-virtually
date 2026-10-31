.class public final synthetic Ll/ۖۙ֫;
.super Ljava/lang/Object;
.source "V8T2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/᩶ۙ֫;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۙ֫;IZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۙ֫;->᩸:Ll/᩶ۙ֫;

    iput p2, p0, Ll/ۖۙ֫;->᩹:I

    iput-boolean p3, p0, Ll/ۖۙ֫;->᩶:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget v0, p0, Ll/ۖۙ֫;->᩹:I

    iget-boolean v1, p0, Ll/ۖۙ֫;->᩶:Z

    iget-object v2, p0, Ll/ۖۙ֫;->᩸:Ll/᩶ۙ֫;

    invoke-static {v2, v0, v1}, Ll/᩶ۙ֫;->֫(Ll/᩶ۙ֫;IZ)V

    return-void
.end method
