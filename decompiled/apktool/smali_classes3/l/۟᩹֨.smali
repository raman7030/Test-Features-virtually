.class public final synthetic Ll/۟᩹֨;
.super Ljava/lang/Object;
.source "I7LP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ۙ:Ljava/util/function/Function;

.field public final synthetic ᩶:Ll/֡᩶֨;

.field public final synthetic ᩸:Ll/ۚ᩶֨;

.field public final synthetic ᩹:Ll/۫᩵۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ᩶֨;Ll/۫᩵۠;Ll/֡᩶֨;Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟᩹֨;->᩸:Ll/ۚ᩶֨;

    iput-object p2, p0, Ll/۟᩹֨;->᩹:Ll/۫᩵۠;

    iput-object p3, p0, Ll/۟᩹֨;->᩶:Ll/֡᩶֨;

    iput-object p4, p0, Ll/۟᩹֨;->ۙ:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Ll/۟᩹֨;->᩶:Ll/֡᩶֨;

    iget-object v1, p0, Ll/۟᩹֨;->ۙ:Ljava/util/function/Function;

    iget-object v2, p0, Ll/۟᩹֨;->᩸:Ll/ۚ᩶֨;

    iget-object v3, p0, Ll/۟᩹֨;->᩹:Ll/۫᩵۠;

    invoke-static {v2, v3, v0, v1}, Ll/ۚ᩶֨;->֫(Ll/ۚ᩶֨;Ll/۫᩵۠;Ll/֡᩶֨;Ljava/util/function/Function;)Ll/ܽ᩶֨;

    move-result-object v0

    return-object v0
.end method
