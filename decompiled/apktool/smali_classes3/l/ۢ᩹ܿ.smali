.class public final synthetic Ll/ۢ᩹ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ll/ܳ᩹ܿ;


# instance fields
.field public final synthetic ֫:Ll/᩵᩶ܿ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ljava/util/function/IntConsumer;

.field public final synthetic ᩳ:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iput-object p2, p0, Ll/ۢ᩹ܿ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۢ᩹ܿ;->ܽ:Ljava/lang/String;

    iput-boolean p4, p0, Ll/ۢ᩹ܿ;->ᩳ:Z

    iput-object p5, p0, Ll/ۢ᩹ܿ;->ܿ:Ljava/util/function/IntConsumer;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 5

    .line 0
    iget-boolean v0, p0, Ll/ۢ᩹ܿ;->ᩳ:Z

    iget-object v1, p0, Ll/ۢ᩹ܿ;->ܿ:Ljava/util/function/IntConsumer;

    iget-object v2, p0, Ll/ۢ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iget-object v3, p0, Ll/ۢ᩹ܿ;->ۧ:Ljava/lang/String;

    iget-object v4, p0, Ll/ۢ᩹ܿ;->ܽ:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V

    return-void
.end method
