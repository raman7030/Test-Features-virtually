.class public final synthetic Ll/ۖ᩵ۜ;
.super Ljava/lang/Object;
.source "I6L2"

# interfaces
.implements Ll/᩵᩵ۜ;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:Z

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Z

.field public final synthetic ᩳ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;IZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩵ۜ;->֫:Ljava/lang/String;

    iput-boolean p2, p0, Ll/ۖ᩵ۜ;->ۧ:Z

    iput-object p3, p0, Ll/ۖ᩵ۜ;->ܽ:Ljava/lang/String;

    iput p4, p0, Ll/ۖ᩵ۜ;->ᩳ:I

    iput-boolean p5, p0, Ll/ۖ᩵ۜ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;
    .locals 9

    .line 0
    iget v3, p0, Ll/ۖ᩵ۜ;->ᩳ:I

    iget-boolean v4, p0, Ll/ۖ᩵ۜ;->ܿ:Z

    iget-object v0, p0, Ll/ۖ᩵ۜ;->֫:Ljava/lang/String;

    iget-boolean v1, p0, Ll/ۖ᩵ۜ;->ۧ:Z

    iget-object v2, p0, Ll/ۖ᩵ۜ;->ܽ:Ljava/lang/String;

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v0 .. v8}, Ll/֡᩵ۜ;->֫(Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;Ll/ᩳܰۡ;Ll/۫᩵ܿ;Ll/۟ۢۜ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
