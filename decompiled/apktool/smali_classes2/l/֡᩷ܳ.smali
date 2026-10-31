.class public final synthetic Ll/֡᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/util/ArrayList;

.field public final synthetic ۙ:Z

.field public final synthetic ۫:Z

.field public final synthetic ۬:Ljava/lang/String;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ܽۢܳ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;ZZZLjava/util/ArrayList;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩷ܳ;->᩸:Ll/ܽۢܳ;

    iput-boolean p2, p0, Ll/֡᩷ܳ;->᩹:Z

    iput-boolean p3, p0, Ll/֡᩷ܳ;->᩶:Z

    iput-boolean p4, p0, Ll/֡᩷ܳ;->ۙ:Z

    iput-object p5, p0, Ll/֡᩷ܳ;->ۗ:Ljava/util/ArrayList;

    iput-object p6, p0, Ll/֡᩷ܳ;->۬:Ljava/lang/String;

    iput-boolean p7, p0, Ll/֡᩷ܳ;->۫:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 0
    iget-object v5, p0, Ll/֡᩷ܳ;->۬:Ljava/lang/String;

    iget-boolean v6, p0, Ll/֡᩷ܳ;->۫:Z

    iget-object v0, p0, Ll/֡᩷ܳ;->᩸:Ll/ܽۢܳ;

    iget-boolean v1, p0, Ll/֡᩷ܳ;->᩹:Z

    iget-boolean v2, p0, Ll/֡᩷ܳ;->᩶:Z

    iget-boolean v3, p0, Ll/֡᩷ܳ;->ۙ:Z

    iget-object v4, p0, Ll/֡᩷ܳ;->ۗ:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v6}, Ll/ܽۢܳ;->֫(Ll/ܽۢܳ;ZZZLjava/util/ArrayList;Ljava/lang/String;Z)V

    return-void
.end method
