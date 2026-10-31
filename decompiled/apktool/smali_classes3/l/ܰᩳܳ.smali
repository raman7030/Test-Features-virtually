.class public final synthetic Ll/ܰᩳܳ;
.super Ljava/lang/Object;
.source "K6ZG"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic ֫:Ll/ܳܿܳ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/۟ۤᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܿܳ;ILl/۟ۤᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰᩳܳ;->֫:Ll/ܳܿܳ;

    iput p2, p0, Ll/ܰᩳܳ;->ۧ:I

    iput-object p3, p0, Ll/ܰᩳܳ;->ܽ:Ll/۟ۤᩳ;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ܰᩳܳ;->ܽ:Ll/۟ۤᩳ;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Ll/ܰᩳܳ;->֫:Ll/ܳܿܳ;

    iget v2, p0, Ll/ܰᩳܳ;->ۧ:I

    invoke-static {v1, v2, v0, p1}, Ll/ܳܿܳ;->֫(Ll/ܳܿܳ;ILl/۟ۤᩳ;Ljava/lang/String;)V

    return-void
.end method
