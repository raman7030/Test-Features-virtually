.class public final synthetic Ll/ۨ᩹ܿ;
.super Ljava/lang/Object;
.source "N17O"

# interfaces
.implements Ll/ܳ᩹ܿ;


# instance fields
.field public final synthetic ֫:Ll/᩵᩶ܿ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:I

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩵᩶ܿ;Ljava/lang/String;IZZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iput-object p2, p0, Ll/ۨ᩹ܿ;->ۧ:Ljava/lang/String;

    iput p3, p0, Ll/ۨ᩹ܿ;->ܽ:I

    iput-boolean p4, p0, Ll/ۨ᩹ܿ;->ᩳ:Z

    iput-boolean p5, p0, Ll/ۨ᩹ܿ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 5

    .line 0
    iget-boolean v0, p0, Ll/ۨ᩹ܿ;->ᩳ:Z

    iget-boolean v1, p0, Ll/ۨ᩹ܿ;->ܿ:Z

    iget-object v2, p0, Ll/ۨ᩹ܿ;->֫:Ll/᩵᩶ܿ;

    iget-object v3, p0, Ll/ۨ᩹ܿ;->ۧ:Ljava/lang/String;

    iget v4, p0, Ll/ۨ᩹ܿ;->ܽ:I

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩵᩶ܿ;->֫(Ll/᩵᩶ܿ;Ljava/lang/String;IZZ)V

    return-void
.end method
