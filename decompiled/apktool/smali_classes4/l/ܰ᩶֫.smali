.class public final synthetic Ll/ܰ᩶֫;
.super Ljava/lang/Object;
.source "M8TF"

# interfaces
.implements Ll/۠ۚ֫;


# instance fields
.field public final synthetic ᩶:Ll/ۚ᩵֫;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/ۚ᩵֫;


# direct methods
.method public synthetic constructor <init>(ILl/ۚ᩵֫;Ll/ۚ᩵֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ܰ᩶֫;->᩸:I

    iput-object p2, p0, Ll/ܰ᩶֫;->᩹:Ll/ۚ᩵֫;

    iput-object p3, p0, Ll/ܰ᩶֫;->᩶:Ll/ۚ᩵֫;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/֡᩵֫;

    .line 2161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2162
    iget v0, p0, Ll/ܰ᩶֫;->᩸:I

    iget-object v1, p0, Ll/ܰ᩶֫;->᩹:Ll/ۚ᩵֫;

    iget-object v2, p0, Ll/ܰ᩶֫;->᩶:Ll/ۚ᩵֫;

    invoke-interface {p1, v0, v1, v2}, Ll/֡᩵֫;->֫(ILl/ۚ᩵֫;Ll/ۚ᩵֫;)V

    return-void
.end method
