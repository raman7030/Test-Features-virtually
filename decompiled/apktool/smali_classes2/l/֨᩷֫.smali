.class public final Ll/֨᩷֫;
.super Ljava/lang/Object;
.source "VB94"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗ᩷֫;

.field public final synthetic ᩹:Ll/ܶ᩷֫;


# direct methods
.method public constructor <init>(Ll/ۗ᩷֫;Ll/ܶ᩷֫;)V
    .locals 0

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩷֫;->᩸:Ll/ۗ᩷֫;

    iput-object p2, p0, Ll/֨᩷֫;->᩹:Ll/ܶ᩷֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 220
    iget-object v0, p0, Ll/֨᩷֫;->᩸:Ll/ۗ᩷֫;

    iget-object v1, v0, Ll/ۗ᩷֫;->ᩳ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֨᩷֫;->᩹:Ll/ܶ᩷֫;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 221
    iget-object v0, v0, Ll/ۗ᩷֫;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
