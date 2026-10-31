.class public Lcom/thegrizzlylabs/sardineandroid/model/Property;
.super Ljava/lang/Object;
.source "Property.java"


# annotations
.annotation runtime Lorg/simpleframework/xml/Namespace;
    prefix = "D"
    reference = "DAV:"
.end annotation

.annotation runtime Lorg/simpleframework/xml/Root;
    strict = false
.end annotation


# instance fields
.field public property:Lorg/w3c/dom/Element;


# direct methods
.method public static bridge synthetic -$$Nest$fgetproperty(Lcom/thegrizzlylabs/sardineandroid/model/Property;)Lorg/w3c/dom/Element;
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Property;->property:Lorg/w3c/dom/Element;

    return-object p0
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getProperty()Lorg/w3c/dom/Element;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/thegrizzlylabs/sardineandroid/model/Property;->property:Lorg/w3c/dom/Element;

    return-object v0
.end method

.method public setProperty(Lorg/w3c/dom/Element;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/thegrizzlylabs/sardineandroid/model/Property;->property:Lorg/w3c/dom/Element;

    return-void
.end method
